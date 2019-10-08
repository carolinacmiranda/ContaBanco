/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author Carol
 */
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-----------------------------");
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta de " + this.getDono() + " aberta com sucesso e com um brinde no valor de R$"
        + this.getSaldo());
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta de " + this.getDono() + " ainda tem saldo. Não pode ser fechada.");
        } else if (getSaldo() < 0) {
            System.out.println("Conta de " + this.getDono() + " em débito. Não pode ser fechada.");
        } else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + " fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito no valor de R$" + v + " realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar para " + this.getDono() + ". A conta encontra-se fechada.");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque no valor de " + v + " realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Saque não realizado. Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar. A conta de " + this.getDono() + " encontra-se fechada.");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade no valor de " + v + " descontada com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível descontar mensalidade. Conta de " + this.getDono() + " encontra-se fechada.");
        }
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }
    
    public void setStatus(boolean st) {
        this.status = st;
    }

    public boolean getStatus() {
        return this.status;
    }
}
