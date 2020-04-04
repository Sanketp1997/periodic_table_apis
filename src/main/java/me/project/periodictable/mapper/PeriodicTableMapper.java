package me.project.periodictable.mapper;

import me.project.periodictable.dao.beans.ElementBean;
import me.project.periodictable.dto.DataAddRequest;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by sanketp on 4/4/20
 */
@Mapper(componentModel = "spring")
public interface PeriodicTableMapper {

    ElementBean dtoToBean(DataAddRequest dataAddRequest);
    List<ElementBean> dtosToBeans(List<DataAddRequest> dataAddRequest);
}
