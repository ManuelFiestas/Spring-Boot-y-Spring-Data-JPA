package com.manuel.appmundialv2.services;

import com.manuel.appmundialv2.dao.IPaisDao;
import com.manuel.appmundialv2.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPaisServiceImpl implements IPaisService {

    @Autowired
    IPaisDao iPaisDao;

    @Override
    public List<Pais> getPaises() {
        return iPaisDao.findAll();
    }
}
