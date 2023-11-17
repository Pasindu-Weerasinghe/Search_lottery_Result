package synapseAssignment.collectdata.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import synapseAssignment.collectdata.Helpers.SearchData;
import synapseAssignment.collectdata.Models.Data;
import synapseAssignment.collectdata.Repository.DataRepo;

@Service
@Transactional
public class DataService {
    @Autowired
    private  DataRepo dataRepo;

    @Autowired
    private ModelMapper modelMapper;


    public Data saveData(){
        SearchData searchData = new SearchData();
        System.out.println(searchData.getLotteryId());


     return dataRepo.save(modelMapper.map(searchData, Data.class));

    }

}
