package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "specialities")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Speciality extends BaseEntity{
	
@Column(name = "description")
 private String description;
 
}
