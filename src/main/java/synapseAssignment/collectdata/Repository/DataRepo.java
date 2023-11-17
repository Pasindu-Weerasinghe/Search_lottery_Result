package synapseAssignment.collectdata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import synapseAssignment.collectdata.Models.Data;

public interface DataRepo extends JpaRepository<Data,String> {
}
