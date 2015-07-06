package br.com.amil.conversorcsv.model;

import org.jsefa.csv.annotation.CsvDataType;
import org.jsefa.csv.annotation.CsvField;

@CsvDataType()
public class Relatorio {

    public Relatorio(){}
    
    @CsvField(pos = 1)
    private String codigoPrestador;
    @CsvField(pos = 2)
    private String nomeOperadora;
    @CsvField(pos = 3)
    private String codigoFilial;
    @CsvField(pos = 4)
    private String nomeFilial;
    @CsvField(pos = 5)
    private String regiaoSaude;
    @CsvField(pos = 6)
    private String subRegiaoSaude;
    @CsvField(pos = 7)
    private String codigoUnidade;
    @CsvField(pos = 8)
    private String nomeUnidade;
    @CsvField(pos = 9)
    private String codigoRede;
    @CsvField(pos = 10)
    private String nomeRede;
    @CsvField(pos = 11)
    private String tipoPessoa;
    @CsvField(pos = 12)
    private String capituloOrientador;
    @CsvField(pos = 13)
    private String elementoDivulgacao;
    @CsvField(pos = 14)
    private String nomePrestador;
    @CsvField(pos = 15)
    private String tipoLogradouro;
    @CsvField(pos = 16)
    private String enderecoPrestador;
    @CsvField(pos = 17)
    private String numero;
    @CsvField(pos = 18)
    private String complemento;
    @CsvField(pos = 19)
    private String municipio;
    @CsvField(pos = 20)
    private String bairro;
    @CsvField(pos = 21)
    private String cep;
    @CsvField(pos = 22)
    private String uf;
    @CsvField(pos = 23)
    private String dddTelefone1;
    @CsvField(pos = 24)
    private String telefone1;
    @CsvField(pos = 25)
    private String dddTelefone2;
    @CsvField(pos = 26)
    private String telefone2;
    @CsvField(pos = 27)
    private String dddFax;
    @CsvField(pos = 28)
    private String fax;
    @CsvField(pos = 29)
    private String direciona;
    @CsvField(pos = 30)
    private String email;
    @CsvField(pos = 31)
    private String tipoEquipamento;
    @CsvField(pos = 32)
    private String isComercializado;
    @CsvField(pos = 33)
    private String modeloOrientador;
    @CsvField(pos =34)
    private String redePropria;
    @CsvField(pos = 35)
    private String classificacoes;
    @CsvField(pos = 36)
    private String a;
    @CsvField(pos = 37)
    private String b;
    @CsvField(pos = 38)
    private String c;

    public Relatorio(String codigoPrestador, String nomeOperadora, String codigoFilial, String nomeFilial, String regiaoSaude, String subRegiaoSaude, String codigoUnidade, String nomeUnidade, String codigoRede, String nomeRede, String tipoPessoa, String capituloOrientador, String elementoDivulgacao, String nomePrestador, String tipoLogradouro, String enderecoPrestador, String numero, String complemento, String municipio, String bairro, String cep, String uf, String dddTelefone1, String telefone1, String dddTelefone2, String telefone2, String dddFax, String fax, String direciona, String email, String tipoEquipamento, String isComercializado, String modeloOrientador, String redePropria, String classificacoes, String a, String b, String c) {
        this.codigoPrestador = codigoPrestador;
        this.nomeOperadora = nomeOperadora;
        this.codigoFilial = codigoFilial;
        this.nomeFilial = nomeFilial;
        this.regiaoSaude = regiaoSaude;
        this.subRegiaoSaude = subRegiaoSaude;
        this.codigoUnidade = codigoUnidade;
        this.nomeUnidade = nomeUnidade;
        this.codigoRede = codigoRede;
        this.nomeRede = nomeRede;
        this.tipoPessoa = tipoPessoa;
        this.capituloOrientador = capituloOrientador;
        this.elementoDivulgacao = elementoDivulgacao;
        this.nomePrestador = nomePrestador;
        this.tipoLogradouro = tipoLogradouro;
        this.enderecoPrestador = enderecoPrestador;
        this.numero = numero;
        this.complemento = complemento;
        this.municipio = municipio;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.dddTelefone1 = dddTelefone1;
        this.telefone1 = telefone1;
        this.dddTelefone2 = dddTelefone2;
        this.telefone2 = telefone2;
        this.dddFax = dddFax;
        this.fax = fax;
        this.direciona = direciona;
        this.email = email;
        this.tipoEquipamento = tipoEquipamento;
        this.isComercializado = isComercializado;
        this.modeloOrientador = modeloOrientador;
        this.redePropria = redePropria;
        this.classificacoes = classificacoes;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getCodigoPrestador() {
        return codigoPrestador;
    }

    public void setCodigoPrestador(String codigoPrestador) {
        this.codigoPrestador = codigoPrestador;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNomeOperadora(String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }

    public String getCodigoFilial() {
        return codigoFilial;
    }

    public void setCodigoFilial(String codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRegiaoSaude() {
        return regiaoSaude;
    }

    public void setRegiaoSaude(String regiaoSaude) {
        this.regiaoSaude = regiaoSaude;
    }

    public String getSubRegiaoSaude() {
        return subRegiaoSaude;
    }

    public void setSubRegiaoSaude(String subRegiaoSaude) {
        this.subRegiaoSaude = subRegiaoSaude;
    }

    public String getCodigoUnidade() {
        return codigoUnidade;
    }

    public void setCodigoUnidade(String codigoUnidade) {
        this.codigoUnidade = codigoUnidade;
    }

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public String getCodigoRede() {
        return codigoRede;
    }

    public void setCodigoRede(String codigoRede) {
        this.codigoRede = codigoRede;
    }

    public String getNomeRede() {
        return nomeRede;
    }

    public void setNomeRede(String nomeRede) {
        this.nomeRede = nomeRede;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCapituloOrientador() {
        return capituloOrientador;
    }

    public void setCapituloOrientador(String capituloOrientador) {
        this.capituloOrientador = capituloOrientador;
    }

    public String getElementoDivulgacao() {
        return elementoDivulgacao;
    }

    public void setElementoDivulgacao(String elementoDivulgacao) {
        this.elementoDivulgacao = elementoDivulgacao;
    }

    public String getNomePrestador() {
        return nomePrestador;
    }

    public void setNomePrestador(String nomePrestador) {
        this.nomePrestador = nomePrestador;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getEnderecoPrestador() {
        return enderecoPrestador;
    }

    public void setEnderecoPrestador(String enderecoPrestador) {
        this.enderecoPrestador = enderecoPrestador;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDddTelefone1() {
        return dddTelefone1;
    }

    public void setDddTelefone1(String dddTelefone1) {
        this.dddTelefone1 = dddTelefone1;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getDddTelefone2() {
        return dddTelefone2;
    }

    public void setDddTelefone2(String dddTelefone2) {
        this.dddTelefone2 = dddTelefone2;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getDddFax() {
        return dddFax;
    }

    public void setDddFax(String dddFax) {
        this.dddFax = dddFax;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDireciona() {
        return direciona;
    }

    public void setDireciona(String direciona) {
        this.direciona = direciona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public String getIsComercializado() {
        return isComercializado;
    }

    public void setIsComercializado(String isComercializado) {
        this.isComercializado = isComercializado;
    }

    public String getModeloOrientador() {
        return modeloOrientador;
    }

    public void setModeloOrientador(String modeloOrientador) {
        this.modeloOrientador = modeloOrientador;
    }

    public String getRedePropria() {
        return redePropria;
    }

    public void setRedePropria(String redePropria) {
        this.redePropria = redePropria;
    }

    public String getClassificacoes() {
        return classificacoes;
    }

    public void setClassificacoes(String classificacoes) {
        this.classificacoes = classificacoes;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Relatorio{" + "codigoPrestador=" + codigoPrestador + ", nomeOperadora=" + nomeOperadora + ", codigoFilial=" + codigoFilial + ", nomeFilial=" + nomeFilial + ", regiaoSaude=" + regiaoSaude + ", subRegiaoSaude=" + subRegiaoSaude + ", codigoUnidade=" + codigoUnidade + ", nomeUnidade=" + nomeUnidade + ", codigoRede=" + codigoRede + ", nomeRede=" + nomeRede + ", tipoPessoa=" + tipoPessoa + ", capituloOrientador=" + capituloOrientador + ", elementoDivulgacao=" + elementoDivulgacao + ", nomePrestador=" + nomePrestador + ", tipoLogradouro=" + tipoLogradouro + ", enderecoPrestador=" + enderecoPrestador + ", numero=" + numero + ", complemento=" + complemento + ", municipio=" + municipio + ", bairro=" + bairro + ", cep=" + cep + ", uf=" + uf + ", dddTelefone1=" + dddTelefone1 + ", telefone1=" + telefone1 + ", dddTelefone2=" + dddTelefone2 + ", telefone2=" + telefone2 + ", dddFax=" + dddFax + ", fax=" + fax + ", direciona=" + direciona + ", email=" + email + ", tipoEquipamento=" + tipoEquipamento + ", isComercializado=" + isComercializado + ", modeloOrientador=" + modeloOrientador + ", redePropria=" + redePropria + ", classificacoes=" + classificacoes + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    
    
    
    //Utilitarios da entidade:
    public static final String[] FILE_HEADER_MAPPING = {"Código do Prestador", "Nome da Operadora", "Código da Filial", "Nome da Filial", "Região Saúde", "Sub Região Saúde", "Código da Unidade", "Nome da Unidade", "Código da Rede", "Nome da Rede", "Tipo Pessoa", "Capítulo Orientador", "Elemento de Divulgação", "Nome do Prestador", "Tipo de Logradouro", "Endereço Prestador", "Número", "Complemento", "Municipio", "Bairro", "CEP", "UF", "DDD Telefone 1", "Telefone 1", "DDD Telefone 2", "Telefone 2", "DDD Fax", "Fax", "Direciona", "Email", "Tipo Equipamento", "Comercializado?", "Modelo do Orientador", "Rede Própria", "Classificações", "A", "B", "C"};

}
