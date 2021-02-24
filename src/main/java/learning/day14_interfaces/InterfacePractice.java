package learning.day14_interfaces;

interface Cars {
    void start();

}

interface ElectricVehicles extends Cars {
    void charge();
    void selfDrive();
}

interface GasVehicles extends Cars {
    void pumpGas();
}

class Tesla_Model3 implements ElectricVehicles {

    @Override
    public void start() {
        System.out.println("Keyless start");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla can self drive");
    }
}

class Jeep_Wrangler implements GasVehicles {

    // Constructor
    public Jeep_Wrangler() {

    }

    @Override
    public void start() {
        System.out.println("Jeep starts with a key");
    }

    @Override
    public void pumpGas() {
        System.out.println("Filling the tank");
    }
}



public class InterfacePractice {


/*
create an interface called Cars
    Actions: start()
create an interface called ElectricVehicles
    Actions: Charge()
    SelfDrive()
create an interface called GasVehicles
    Actions: PumpGas()
create classes:
    1. Tesla_Model3:
    implement Cars and ElectricVehicles Interfaces
    2. Jeep_wrangler:
    implement Cars and GasVehicles Interfaces
    3. ToyotaHybird:
    implement Cars, GasVehicles, and ElectricVehicles Interfaces
 */

    public static void main(String[] args) {
        // Cars c1 = new Cars(); // not valid
        GasVehicles c1 = new Jeep_Wrangler();
        ElectricVehicles c2 = new Tesla_Model3();
        c1.start();
        c1.pumpGas();
        c2.charge();
        c2.start();
        c2.selfDrive();

        }
}

interface A {

}

interface B {

}

class C implements B, A {

}