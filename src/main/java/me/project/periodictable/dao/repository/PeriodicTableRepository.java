package me.project.periodictable.dao.repository;

import me.project.periodictable.dao.beans.ElementBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sanketp on 4/4/20
 */
@Repository
public interface PeriodicTableRepository extends JpaRepository<ElementBean,Integer>{
    ElementBean getByAtomicNumber(Integer atomicNumber);

    ElementBean getByName(String atomicName);

    ElementBean getBySymbol(String symbol);

    List<ElementBean> findAllByBondingType(String bondingType);

    List<ElementBean> findAllByGroupBlock(String atomicGroup);

    List<ElementBean> findAllByStandardState(String atomicState);
}
