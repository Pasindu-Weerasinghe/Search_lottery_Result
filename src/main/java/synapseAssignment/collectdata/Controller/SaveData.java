package synapseAssignment.collectdata.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import synapseAssignment.collectdata.Models.Data;
import synapseAssignment.collectdata.Service.DataService;

@RestController
@RequestMapping(value = "/lottery")
public class SaveData {
    @Autowired
    private DataService dataService;
    @PostMapping("/saveData")
    public Data saveData(){
        return dataService.saveData();
    }
}
