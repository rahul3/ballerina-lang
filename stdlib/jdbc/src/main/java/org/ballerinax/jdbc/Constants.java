/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ballerinax.jdbc;

import org.ballerinalang.jvm.types.BPackage;

import java.util.UUID;

import static org.ballerinalang.jvm.util.BLangConstants.ORG_NAME_SEPARATOR;

/**
 * Constants for JDBC client.
 *
 * @since 0.8.0
 */
public final class Constants {

    /**
     * Constants for SQL DataTypes.
     */
    public static final class SQLDataTypes {
        public static final String VARCHAR = "VARCHAR";
        public static final String CHAR = "CHAR";
        public static final String LONGVARCHAR = "LONGVARCHAR";
        public static final String NCHAR = "NCHAR";
        public static final String LONGNVARCHAR = "LONGNVARCHAR";
        public static final String NVARCHAR = "NVARCHAR";
        public static final String NUMERIC = "NUMERIC";
        public static final String DECIMAL = "DECIMAL";
        public static final String BIT = "BIT";
        public static final String BOOLEAN = "BOOLEAN";
        public static final String TINYINT = "TINYINT";
        public static final String SMALLINT = "SMALLINT";
        public static final String INTEGER = "INTEGER";
        public static final String BIGINT = "BIGINT";
        public static final String REAL = "REAL";
        public static final String FLOAT = "FLOAT";
        public static final String DOUBLE = "DOUBLE";
        public static final String BINARY = "BINARY";
        public static final String BLOB = "BLOB";
        public static final String LONGVARBINARY = "LONGVARBINARY";
        public static final String VARBINARY = "VARBINARY";
        public static final String CLOB = "CLOB";
        public static final String NCLOB = "NCLOB";
        public static final String DATE = "DATE";
        public static final String TIME = "TIME";
        public static final String DATETIME = "DATETIME";
        public static final String TIMESTAMP = "TIMESTAMP";
        public static final String ARRAY = "ARRAY";
        public static final String STRUCT = "STRUCT";
        public static final String REFCURSOR = "REFCURSOR";
    }

    /**
     * DB Types with first class support.
     */
    public static final class DBTypes {
        public static final String SQLSERVER = "SQLSERVER";
        public static final String ORACLE = "ORACLE";
        public static final String SYBASE = "SYBASE";
        public static final String POSTGRESQL = "POSTGRESQL";
        public static final String IBMDB2 = "DB2";

        public static final String DERBY_SERVER = "DERBY_SERVER";
        public static final String DERBY_FILE = "DERBY_FILE";

        public static final String HSQLDB = "HSQLDB";
        public static final String HSQLDB_SERVER = "HSQLDB_SERVER";
        public static final String HSQLDB_FILE = "HSQLDB_FILE";

        public static final String MYSQL = "MYSQL";

        public static final String H2 = "H2";
        public static final String H2_SERVER = "H2_SERVER";
        public static final String H2_FILE = "H2_FILE";
        public static final String H2_MEMORY = "H2_MEMORY";
    }

    /**
     * XA Datasource for DB Types with first class support.
     */
    public static final class XADataSources {
        public static final String MYSQL_5_XA_DATASOURCE = "com.mysql.jdbc.jdbc2.optional.MysqlXADataSource";
        public static final String MYSQL_6_XA_DATASOURCE = "com.mysql.cj.jdbc.MysqlXADataSource";
        public static final String SQLSERVER_XA_DATASOURCE = "com.microsoft.sqlserver.jdbc.SQLServerXADataSource";
        public static final String ORACLE_XA_DATASOURCE = "oracle.jdbc.xa.client.OracleXADataSource";
        public static final String SYBASE_XA_DATASOURCE = "com.sybase.jdbc3.jdbc.SybXADataSource";
        public static final String POSTGRES_XA_DATASOURCE = "org.postgresql.xa.PGXADataSource";
        public static final String IBMDB2_XA_DATASOURCE = "com.ibm.db2.jdbc.DB2XADataSource";
        public static final String HSQLDB_XA_DATASOURCE = "org.hsqldb.jdbc.pool.JDBCXADataSource";
        public static final String H2_XA_DATASOURCE = "org.h2.jdbcx.JdbcDataSource";
        public static final String DERBY_SERVER_XA_DATASOURCE = "org.apache.derby.jdbc.ClientXADataSource";
        public static final String DERBY_FILE_XA_DATASOURCE = "org.apache.derby.jdbc.EmbeddedXADataSource";
    }

    /**
     * Constants for SQL Query Parameter direction.
     */
    public static final class QueryParamDirection {
        public static final int IN = 0;
        public static final int OUT = 1;
        public static final int INOUT = 2;
        public static final String DIR_IN = "IN";
        public static final String DIR_OUT = "OUT";
        public static final String DIR_INOUT = "INOUT";

    }

    /**
     * Constants for Endpoint Configs.
     */
    public static final class EndpointConfig {
        public static final String URL = "url";
        public static final String NAME = "name";
        public static final String USERNAME = "username";
        public static final String PASSWORD = "password";
        public static final String POOL_OPTIONS = "poolOptions";
        public static final String DB_OPTIONS = "dbOptions";
    }

    /**
     * Constants for Endpoint Configs.
     */
    public static final class Options {
        //String
        public static final String URL = "url";
        public static final String DATASOURCE_CLASSNAME = "dataSourceClassName";
        public static final String CONNECTION_INIT_SQL = "connectionInitSql";

        //Boolean
        public static final String AUTOCOMMIT = "autoCommit";
        public static final String IS_XA = "isXA";

        //Int
        public static final String MAXIMUM_POOL_SIZE = "maximumPoolSize";
        public static final String CONNECTION_TIMEOUT_IN_MILLIS = "connectionTimeoutInMillis";
        public static final String IDLE_TIMEOUT_IN_MILLIS = "idleTimeoutInMillis";
        public static final String MINIMUM_IDLE = "minimumIdle";
        public static final String MAX_LIFETIME_IN_MILLIS = "maxLifetimeInMillis";
        public static final String VALIDATION_TIMEOUT_IN_MILLIS = "validationTimeoutInMillis";
    }

    /**
     * Constants used for database product names.
     */
    public static final class DatabaseNames {
        public static final String ORACLE = "oracle";
        public static final String POSTGRESQL = "postgresql";
        public static final String MYSQL = "mysql";
        public static final String MSSQL_SERVER = "microsoft sql server";
    }

    public static final String CONNECTOR_NAME = "ClientConnector";
    public static final String TIMEZONE_UTC = "UTC";
    public static final String QUESTION_MARK = "?";
    public static final String STRUCT_TIME = "Time";
    public static final String STRUCT_TIME_PACKAGE = "ballerina" + ORG_NAME_SEPARATOR + "time";
    public static final String STRUCT_TIME_FIELD = "time";
    public static final String URL = "url";
    public static final String USER = "user";
    public static final String PASSWORD = "password";

    public static final String JDBC_PACKAGE_PATH = "ballerinax" + ORG_NAME_SEPARATOR + "java_jdbc";
    public static final BPackage JDBC_PACKAGE_ID = new BPackage("ballerinax", "java.jdbc", "0.0.0");
    public static final String SQL_PARAMETER = "Parameter";
    public static final String JDBC_CLIENT = "JdbcClient";
    public static final String JDBC_UPDATE_RESULT = "UpdateResult";
    public static final String JDBC_BATCH_UPDATE_RESULT = "BatchUpdateResult";
    public static final String CONNECTOR_ID_KEY = UUID.randomUUID().toString();

    public static final String APPLICATION_ERROR_DATA_RECORD_NAME = "ApplicationErrorData";
    public static final String DATABASE_ERROR_DATA_RECORD_NAME = "DatabaseErrorData";
    public static final String APPLICATION_ERROR_MESSAGE = "Application Error Occurred";
    public static final String DATABASE_ERROR_MESSAGE = "Database Error Occurred";
    public static final String APPLICATION_ERROR_CODE = "{ballerinax/java.jdbc}ApplicationError";
    public static final String DATABASE_ERROR_CODE = "{ballerinax/java.jdbc}DatabaseError";

    public static final String PARAMETER_SQL_TYPE_FIELD = "sqlType";
    public static final String PARAMETER_VALUE_FIELD = "value";
    public static final String PARAMETER_DIRECTION_FIELD = "direction";
    public static final String PARAMETER_RECORD_TYPE_FIELD = "recordType";
}
