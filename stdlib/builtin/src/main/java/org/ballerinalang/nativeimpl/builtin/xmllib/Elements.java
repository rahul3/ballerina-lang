/**
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 **/

package org.ballerinalang.nativeimpl.builtin.xmllib;

import org.ballerinalang.bre.Context;
import org.ballerinalang.bre.bvm.BlockingNativeCallableUnit;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.model.util.XMLNodeType;
import org.ballerinalang.model.values.BIterator;
import org.ballerinalang.model.values.BString;
import org.ballerinalang.model.values.BValue;
import org.ballerinalang.model.values.BValueArray;
import org.ballerinalang.model.values.BXML;
import org.ballerinalang.model.values.BXMLSequence;
import org.ballerinalang.nativeimpl.lang.utils.ErrorHandler;
import org.ballerinalang.natives.annotations.BallerinaFunction;
import org.ballerinalang.natives.annotations.ReturnType;

/**
 * Get all the elements-type items of a xml.
 * 
 * @since 0.88
 */
@BallerinaFunction(
        orgName = "ballerina", packageName = "builtin",
        functionName = "xml.elements",
        returnType = {@ReturnType(type = TypeKind.XML)},
        isPublic = true
)
public class Elements extends BlockingNativeCallableUnit {

    private static final String OPERATION = "get elements from xml";

    @Override
    public void execute(Context ctx) {
        BValue result = null;
        try {
            // Accessing Parameters.
            BXML value = (BXML) ctx.getRefArgument(0);
            BValueArray array = new BValueArray();
            if (value.getNodeType() == XMLNodeType.TEXT) {
                result = generateCodePointSequence(value, array);
            } else {
                result = value.elements();
            }
        } catch (Throwable e) {
            ErrorHandler.handleXMLException(OPERATION, e);
        }
        
        // Setting output value.
        ctx.setReturnValues(result);
    }

    private BValue generateCodePointSequence(BXML value, BValueArray array) {
        BIterator bIterator = value.newIterator();
        long i = 0;
        while(bIterator.hasNext()) {
            BString next = (BString) bIterator.getNext();
            array.add(i++, next);
        }
        return new BXMLSequence(array);
    }
}
