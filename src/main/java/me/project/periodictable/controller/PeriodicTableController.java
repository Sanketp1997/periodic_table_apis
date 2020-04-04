package me.project.periodictable.controller;

import me.project.periodictable.dao.beans.ElementBean;
import me.project.periodictable.dto.DataAddRequest;
import me.project.periodictable.service.PeriodicTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sanketp on 4/4/20
 */

@RestController
@CrossOrigin
public class PeriodicTableController {
    @Autowired
    private PeriodicTableService periodicTableService;

    @GetMapping(value = "/")
    public List<ElementBean> getAllElements(){
        return periodicTableService.getAllElements();
    }

    @GetMapping(value = "/atomicNumber/{atomicNumber}")
    public ElementBean getByAtomicNumber(@PathVariable Integer atomicNumber){
        return periodicTableService.getByAtomicNumber(atomicNumber);
    }

    @GetMapping(value = "/atomicName/{atomicName}")
    public ElementBean getByAtomicName(@PathVariable String atomicName){
        return periodicTableService.getByAtomicName(atomicName);
    }

    @GetMapping(value = "/symbol/{symbol}")
    public ElementBean getBySymbol(@PathVariable String symbol){
        return periodicTableService.getBySymbol(symbol);
    }

    @GetMapping(value = "/bondingType/{bondingType}")
    public List<ElementBean> getByBondingType(@PathVariable String bondingType){
        return periodicTableService.getByBondingType(bondingType);
    }

    @GetMapping(value = "/atomicGroup/{atomicGroup}")
    public List<ElementBean> getByAtomicGroup(@PathVariable String atomicGroup){
        return periodicTableService.getByAtomicGroup(atomicGroup);
    }

    @GetMapping(value = "/atomicState/{atomicState}")
    public List<ElementBean> getByAtomicState(@PathVariable String atomicState){
        return periodicTableService.getByAtomicState(atomicState);
    }

    @PostMapping(value = "/addElements")
    public void addElements(@RequestBody List<DataAddRequest> dataAddRequest){
        periodicTableService.addElements(dataAddRequest);
    }

    @PostMapping(value = "/addElement")
    public void addElement(@RequestBody DataAddRequest dataAddRequest){
        periodicTableService.addElement(dataAddRequest);
    }
}
