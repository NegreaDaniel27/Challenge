// 1   să calculeze salariul unui angajat primit ca parametru
// 2   primește o listă de angajați și încerarcă atribuirea lor pe un proiect. Se vor afișa angajații din această listă care nu sunt disponibili în perioada derulării proiectului, iar pe cei care sunt disponbili îi va asigna pe proiect.
// 3   căruia se pot lista toți angajații dintr-un departament trimis ca parametru.
// 4   primește ca parametru o entitate de tip proiect și care returnează o listă de departamente care reprezintă departamentele implicate în acel proiect.
// 5   să primească ca parametrii un angajat care hotărăște să părăsească compania și un înlocuitor al acestuia. Este nevoie ca acest cod să realizeze interschimbarea celor doi în toate rolurile pe care le are angajatul care părăsește compania (Departamente, Proiecte, superior ierarhic direct)


import Dao.AngajatDao;
import Dao.DepartamenteDao;
import Dao.FunctiiDao;
import Model.Angajat;
import Model.Departamente;
import Model.Director;
import Model.Functii;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AngajatDao angajatDao = new AngajatDao();
        FunctiiDao functiiDao = new FunctiiDao();
        DepartamenteDao departamenteDao = new DepartamenteDao();




//        List<Angajat> angajatList = angajatDao.findAll(1);
//        System.out.println(angajatList);


//        List<Functii> functiiList = functiiDao.findAll();
//        System.out.println(functiiList);

//        Angajat angajat = angajatDao.findById(2);
//        System.out.println(angajat);


//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(dataAngajare);
//        int year = calendar.get(Calendar.YEAR);



/////  LISTA CU TOTI ANGAJATII DINTR-UN DEPARTAMENT TRIMIS CA PARAMETRU   /////
        List<Departamente> departamenteList = departamenteDao.findAll(1);
        System.out.println(departamenteList);


//        Departamente departamente = departamenteDao.findById(2);
//        System.out.println(departamente);



    }
}