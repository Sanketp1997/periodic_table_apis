package me.project.periodictable.service;

import me.project.periodictable.dao.beans.ElementBean;
import me.project.periodictable.dto.DataAddRequest;

import java.util.List;

/**
 * Created by sanketp on 4/4/20
 */
public interface PeriodicTableService {

    public List<ElementBean> getAllElements();

    ElementBean getByAtomicNumber(Integer atomicNumber);

    ElementBean getByAtomicName(String atomicName);

    ElementBean getBySymbol(String symbol);

    List<ElementBean> getByBondingType(String bondingType);

    List<ElementBean> getByAtomicGroup(String atomicGroup);

    List<ElementBean> getByAtomicState(String atomicState);

    void addElements(List<DataAddRequest> dataAddRequest);

    void addElement(DataAddRequest dataAddRequest);
}
