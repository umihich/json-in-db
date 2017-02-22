package com.oracle.st.pm.json.movieTicketing.test;

import com.oracle.st.pm.json.movieTicketing.data.ExternalInterfaces;
import com.oracle.st.pm.json.movieTicketing.utilitiy.CollectionManager;
import com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection;

import java.sql.Connection;

import oracle.soda.OracleDatabase;
import oracle.soda.rdbms.OracleRDBMSClient;

public class getTheatersFromFandango {

    public getTheatersFromFandango() {
        super();
    }

    public static void main(String[] args) {
        try {
          ExternalInterfaces.loadTheatersFromFandango(DBConnection.getOracleDatabase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
