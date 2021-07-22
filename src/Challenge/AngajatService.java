package Challenge;

import Dao.AngajatDao;
import Dao.FunctiiDao;
import Model.Angajat;

import java.util.List;

public class AngajatService {

    private final AngajatDao angajatDao;
    private final FunctiiDao functiiDao;

    public AngajatService(AngajatDao angajatDao, FunctiiDao functiiDao) {
        this.angajatDao = angajatDao;
        this.functiiDao = functiiDao;
    }


    public List<Angajat> findAll(int id) {
        return angajatDao.findAll(id);
    }




}
