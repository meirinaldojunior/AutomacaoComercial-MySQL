/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.cadastro;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author meirinaldo
 */
@Entity
@Table(name = "usuarios_iape", catalog = "iape", schema = "")
@NamedQueries({
    @NamedQuery(name = "UsuariosIape.findAll", query = "SELECT u FROM UsuariosIape u"),
    @NamedQuery(name = "UsuariosIape.findByCod", query = "SELECT u FROM UsuariosIape u WHERE u.cod = :cod"),
    @NamedQuery(name = "UsuariosIape.findByNome", query = "SELECT u FROM UsuariosIape u WHERE u.nome = :nome"),
    @NamedQuery(name = "UsuariosIape.findByUsuario", query = "SELECT u FROM UsuariosIape u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "UsuariosIape.findByNascimento", query = "SELECT u FROM UsuariosIape u WHERE u.nascimento = :nascimento"),
    @NamedQuery(name = "UsuariosIape.findByEmail", query = "SELECT u FROM UsuariosIape u WHERE u.email = :email"),
    @NamedQuery(name = "UsuariosIape.findByTelefone", query = "SELECT u FROM UsuariosIape u WHERE u.telefone = :telefone"),
    @NamedQuery(name = "UsuariosIape.findByTurma", query = "SELECT u FROM UsuariosIape u WHERE u.turma = :turma")})
public class UsuariosIape implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod")
    private Integer cod;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "nascimento")
    private String nascimento;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "turma")
    private int turma;

    public UsuariosIape() {
    }

    public UsuariosIape(Integer cod) {
        this.cod = cod;
    }

    public UsuariosIape(Integer cod, String nome, String usuario, String nascimento, String email, String telefone, int turma) {
        this.cod = cod;
        this.nome = nome;
        this.usuario = usuario;
        this.nascimento = nascimento;
        this.email = email;
        this.telefone = telefone;
        this.turma = turma;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        Integer oldCod = this.cod;
        this.cod = cod;
        changeSupport.firePropertyChange("cod", oldCod, cod);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        String oldNascimento = this.nascimento;
        this.nascimento = nascimento;
        changeSupport.firePropertyChange("nascimento", oldNascimento, nascimento);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        int oldTurma = this.turma;
        this.turma = turma;
        changeSupport.firePropertyChange("turma", oldTurma, turma);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod != null ? cod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosIape)) {
            return false;
        }
        UsuariosIape other = (UsuariosIape) object;
        if ((this.cod == null && other.cod != null) || (this.cod != null && !this.cod.equals(other.cod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.cadastro.UsuariosIape[ cod=" + cod + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
