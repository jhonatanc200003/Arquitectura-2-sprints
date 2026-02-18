@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    private Long cedula;

    private String nombreCompleto;
    private String correo;
    private String usuario;
    private String password;
}
