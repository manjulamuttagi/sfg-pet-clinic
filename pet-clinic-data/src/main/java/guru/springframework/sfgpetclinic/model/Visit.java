package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "visits")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Visit extends BaseEntity{

	
@Column(name="data")
private LocalDate date;

@Column(name="description")
private String description;

@ManyToOne
@JoinColumn(name="pet_id")
private Pet pet;
}
