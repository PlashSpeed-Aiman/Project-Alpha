package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
class coursedatabasehelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "course"; // the name of our database
    private static final int DB_VERSION = 1; // the version of the database
    coursedatabasehelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        updateMyDatabase(db, 0, DB_VERSION);
        db.execSQL("CREATE TABLE COURSE (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "COURSECODE TEXT, "
                + "DESCRIPTION TEXT);");
        insertCourse(db,"Statics", "MECH1301", "General principles of statics, force vectors, equilibrium, analysis of trusses, frames and machines, forces and moments, friction, centroids and moment of inertia. ");
        insertCourse(db, "Engineering Mathematics 1", "MATH1310", "Complex numbers, vectors and geometry in space, matrix algebra, eigenvalues and eigenvectors, linear system " +
                "of equations, differentiation and integration with applications");
        insertCourse(db, "Dynamics", "MECH1302", "Kinematics  of  particles  and  rigid  bodies,  kinetics  of  particles  and  rigid  bodies,  Newton’s  laws  of  motion, " +
                "equations of motion, work and energy methods, impulse and momentum.  ");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }
    private static void insertCourse(SQLiteDatabase db, String name, String courseCode, String description) {
        ContentValues courseValue = new ContentValues();
        courseValue.put("NAME", name);
        courseValue.put("COURSECODE", courseCode);
        courseValue.put("DESCRIPTION", description);
        db.insert("COURSE", null, courseValue);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {

        }
        if (oldVersion < 2) {

        }
    }
}