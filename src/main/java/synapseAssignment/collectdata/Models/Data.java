package synapseAssignment.collectdata.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
@Table(name="PasinduUCSCLotteryData")
@Getter
@Setter
public class Data {
    @Id
    Integer lotteryId;
    String lotteryName;
    String date;
    String result;
}
