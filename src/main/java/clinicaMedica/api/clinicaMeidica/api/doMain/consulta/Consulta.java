package clinicaMedica.api.clinicaMeidica.api.doMain.consulta;


import clinicaMedica.api.clinicaMeidica.api.doMain.enfermeiro.Enfermeiro;
import clinicaMedica.api.clinicaMeidica.api.doMain.medico.Medico;
import clinicaMedica.api.clinicaMeidica.api.doMain.paciente.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.Media;
import java.time.LocalDateTime;

@Table(name = "consultas")
@Entity(name = "Consulta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Consulta {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id")
    private Medico medico;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enfermeiro_id")
    private Enfermeiro enfermeiro;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    private LocalDateTime localDateTime;
    @Column(name = "motivo_cancelamento")
    @Enumerated(EnumType.STRING)
    private MotivoDoCancelamento motivoDoCancelamento;





    public Consulta(Long id, Medico medico, Paciente paciente, Enfermeiro enfermeiro, LocalDateTime data) {
        this.id =id;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.paciente = paciente;
        this.localDateTime = data;
    }


    public void cancelar(MotivoDoCancelamento motivo){
        this.motivoDoCancelamento = motivo;
    }



}
