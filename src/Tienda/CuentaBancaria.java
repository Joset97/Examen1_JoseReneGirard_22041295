package Tienda;

/**
 *
 * @author jrgir
 */
public class CuentaBancaria {

    private double saldo;
    private int NoCuenta;

    public CuentaBancaria(double saldo, int NoCuenta) throws MiExcepcion {
        setSaldo(saldo);
        this.NoCuenta = NoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public int getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "saldo=" + saldo + ", NoCuenta=" + NoCuenta + '}';
    }

}
 /*public void setSaldo(double saldo) throws MiExcepcion {
        try {
            if (saldo <= 2000 && saldo >= 10000) {
                this.saldo = saldo;
            }
            throw new MiExcepcion("El saldo tiene que ser: saldo<= 2000 && saldo>=10000");

        } catch (MiExcepcion e) {
            e.getMessage();
        }
    }*/
