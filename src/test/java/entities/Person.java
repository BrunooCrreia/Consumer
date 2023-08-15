package entities;

public class Person {

    private Integer cracha;

    private Integer matricula;

    private Integer id;

    private String name;

    private String cpf;

    private String dataAdmissao;

    private Integer idEstrutura;

    private Integer tipoDoFuncionario;

    private Integer tipoSalario;

    private Integer idHorario;

    private String maisDeUmVinculoEmpregaticio;

    private Integer idRegraDeCalculo;

    private String codigoPis;

    public Person(Integer cracha, Integer matricula, Integer id, String name, String cpf, String dataAdmissao,
                  Integer idEstrutura, Integer tipoDoFuncionario, Integer tipoSalario, Integer idSalario, Integer idHorario,
                  String maisDeUmVinculoEmpregaticio, Integer idRegraDeCalculo, String codigoPis) {
        this.cracha = cracha;
        this.matricula = matricula;
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.idEstrutura = idEstrutura;
        this.tipoDoFuncionario = tipoDoFuncionario;
        this.tipoSalario = tipoSalario;
        this.idHorario = idHorario;
        this.maisDeUmVinculoEmpregaticio = maisDeUmVinculoEmpregaticio;
        this.idRegraDeCalculo = idRegraDeCalculo;
        this.codigoPis = codigoPis;
    }

    public Person() {

    }

    public Integer getCracha() {
        return cracha;
    }

    public void setCracha(Integer cracha) {
        this.cracha = cracha;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Integer getIdEstrutura() {
        return idEstrutura;
    }

    public void setIdEstrutura(Integer idEstrutura) {
        this.idEstrutura = idEstrutura;
    }

    public Integer getTipoDoFuncionario() {
        return tipoDoFuncionario;
    }

    public void setTipoDoFuncionario(Integer tipoDoFuncionario) {
        this.tipoDoFuncionario = tipoDoFuncionario;
    }

    public Integer getTipoSalario() {
        return tipoSalario;
    }

    public void setTipoSalario(Integer tipoSalario) {
        this.tipoSalario = tipoSalario;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public String getMaisDeUmVinculoEmpregaticio() {
        return maisDeUmVinculoEmpregaticio;
    }

    public void setMaisDeUmVinculoEmpregaticio(String maisDeUmVinculoEmpregaticio) {
        this.maisDeUmVinculoEmpregaticio = maisDeUmVinculoEmpregaticio;
    }

    public Integer getIdRegraDeCalculo() {
        return idRegraDeCalculo;
    }

    public void setIdRegraDeCalculo(Integer idRegraDeCalculo) {
        this.idRegraDeCalculo = idRegraDeCalculo;
    }

    public String getCodigoPis() {
        return codigoPis;
    }

    public void setCodigoPis(String codigoPis) {
        this.codigoPis = codigoPis;
    }

}