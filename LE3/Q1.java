/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

abstract class Bharatvanshi {
    public void fight() {
        System.out.println("Fighting...");
    }

    public abstract void obey();
    public abstract void kind();
}

class Pandav extends Bharatvanshi {
    @Override
    public void obey() {
        System.out.println("Pandav obeying...");
    }

    @Override
    public void kind() {
        System.out.println("Pandav being kind...");
    }
}

class Arjun extends Pandav {
}

class Bheem extends Pandav {
    @Override
    public void kind() {
        System.out.println("Bheem being less kind...");
    }
}

class Kaurav extends Bharatvanshi {
    @Override
    public void obey() {
        System.out.println("Kaurav disobeying...");
    }

    @Override
    public void kind() {
        System.out.println("Kaurav being cruel...");
    }
}

class Duryodhan extends Kaurav {
    
}

class Vikarn extends Kaurav {
    @Override
    public void obey() {
        System.out.println("Vikarn obeying...");
    }

    @Override
    public void kind() {
        System.out.println("Vikarn being kind...");
    }
}

public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        arjun.obey();
        arjun.kind();

        Bharatvanshi bheem = new Bheem();
        bheem.obey();
        bheem.kind();

        Bharatvanshi duryodhan = new Duryodhan();
        duryodhan.obey();
        duryodhan.kind();

        Bharatvanshi vikarn = new Vikarn();
        vikarn.obey();
        vikarn.kind();
    }
}

