package application;


import Services.KairosService;
import Services.PersonService;
import entities.Company;
import entities.Person;

import java.io.IOException;
import java.net.HttpURLConnection;

public class Main {
    public static void main(String[] args) throws IOException {
        //instancias
        Person person = new Person();
        KairosService ks = new KairosService();
        PersonService ps = new PersonService();
        Company cy = new Company("51.761.755/0001-40","8fc1da03-81a2-4c67-9dc4-3f0ca5f328bf");
        String endPoint = "People/SavePerson";
        ks.openConnectionApi(cy,endPoint);
        String requestBory = "{\n" +
                "    \"Matricula\": 456,\n" +
                "    \"Cracha\": 456,\n" +
                "    \"Nome\": \"Teste injelij\",\n" +
                "    \"Cpf\": \"12345678901\",\n" +
                "    \"CpfResponsavel\": \"98765432109\",\n" +
                "    \"DataAdmissao\": \"2022-07-15T10:00:00\",\n" +
                "    \"BaseHoras\": 160.0,\n" +
                "    \"Estrutura\": {\n" +
                "        \"Id\": 5\n" +
                "    },\n" +
                "    \"TipoFuncionario\": {\n" +
                "        \"IdTipoFuncionario\": 2\n" +
                "    },\n" +
                "    \"TipoSalario\": {\n" +
                "        \"Id\": 102\n" +
                "    },\n" +
                "    \"Horarios\": [\n" +
                "        {\n" +
                "            \"Id\": 0,\n" +
                "            \"Horario\": {\n" +
                "                \"Id\": 3\n" +
                "            },\n" +
                "            \"Inicio\": \"2022-07-15T08:00:00\",\n" +
                "            \"Fim\": \"2022-07-15T17:00:00\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"MaisDeUmVinculoEmpregaticio\": true,\n" +
                "    \"RegrasCalculo\": [\n" +
                "        {\n" +
                "            \"Id\": 0,\n" +
                "            \"Regra\": {\n" +
                "                \"Id\": 2\n" +
                "            },\n" +
                "            \"Inicio\": \"2022-07-15T10:00:00\",\n" +
                "            \"Fim\": \"2022-07-31T10:00:00\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"CodigoPis\": \"98765432101\",\n" +
                "    \"Sexo\": 2,\n" +
                "    \"AmbienteTrabalhoPessoa\": [\n" +
                "        {\n" +
                "            \"Id\": 0,\n" +
                "            \"Inicio\": \"2022-07-15T10:00:00\",\n" +
                "            \"Fim\": \"2022-07-15T18:00:00\",\n" +
                "            \"TipoAmbienteTrabalho\": 3\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        ks.sendRquestApi(ks.getConnection(),requestBory);
        System.Out.print(ks.readingApi().toString());







        //1-coletaDados
        //2-OpenConnectionApi : Passando dados e o endPoint que será solicitado
        //3-SendRequestApi :  passando o connection instanciado  e o body.
        //4- Depois retornando a resposta da Api.







    }
}