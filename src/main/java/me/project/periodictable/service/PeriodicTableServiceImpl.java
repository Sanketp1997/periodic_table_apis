package me.project.periodictable.service;

import me.project.periodictable.dao.beans.ElementBean;
import me.project.periodictable.dao.repository.PeriodicTableRepository;
import me.project.periodictable.dto.DataAddRequest;
import me.project.periodictable.mapper.PeriodicTableMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by sanketp on 4/4/20
 */
@Service
@Transactional
public class PeriodicTableServiceImpl implements PeriodicTableService{
    @Autowired PeriodicTableRepository periodicTableRepository;
    private PeriodicTableMapper periodicTableMapper = Mappers.getMapper(PeriodicTableMapper.class);
    @Override
    public List<ElementBean> getAllElements() {
        return periodicTableRepository.findAll();
    }

    @Override
    public ElementBean getByAtomicNumber(Integer atomicNumber) {
        return periodicTableRepository.getByAtomicNumber(atomicNumber);
    }

    @Override
    public ElementBean getByAtomicName(String atomicName) {
        return periodicTableRepository.getByName(atomicName);
    }

    @Override
    public ElementBean getBySymbol(String symbol) {
        return periodicTableRepository.getBySymbol(symbol);
    }

    @Override
    public List<ElementBean> getByBondingType(String bondingType) {
        return periodicTableRepository.findAllByBondingType(bondingType);
    }

    @Override
    public List<ElementBean> getByAtomicGroup(String atomicGroup) {
        return periodicTableRepository.findAllByGroupBlock(atomicGroup);
    }

    @Override
    public List<ElementBean> getByAtomicState(String atomicState) {
        return periodicTableRepository.findAllByStandardState(atomicState);
    }

    @Override
    public void addElements(List<DataAddRequest> dataAddRequest) {
        List<ElementBean> elementBeans = periodicTableMapper.dtosToBeans(dataAddRequest);
        periodicTableRepository.saveAll(elementBeans);
    }

    @Override
    public void addElement(DataAddRequest dataAddRequest) {
        ElementBean elementBean = periodicTableMapper.dtoToBean(dataAddRequest);
        periodicTableRepository.save(elementBean);
    }
}
