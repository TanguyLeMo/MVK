    public class example {
    public static void main(String[] args) {
        // Einfache Prädikate (Aussagen)
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("Prädikat A: " + a); // true
        System.out.println("Prädikat B: " + b); // false
        System.out.println("Prädikat C: " + c); // true

        // Logische Operationen
        boolean andResult = a && b; // UND-Operator
        boolean orResult = a || b;  // ODER-Operator
        boolean notA = !a;          // NICHT-Operator
        boolean implication = !a || b; // Implikation (A -> B entspricht !A ODER B)

        System.out.println("A UND B: " + andResult);
        System.out.println("A ODER B: " + orResult);
        System.out.println("NICHT A: " + notA);
        System.out.println("A -> B (Implikation): " + implication); // false

        // Verzweigungen mit If-Statements
        if (a) {
            System.out.println("A ist wahr, also wird dieser Code ausgeführt.");
        } else {
            System.out.println("A ist falsch, also wird dieser Code ausgeführt.");
        }

        if (b) {
            System.out.println("B ist wahr, also wird dieser Code ausgeführt.");
        } else {
            System.out.println("B ist falsch, also wird dieser Code ausgeführt.");
        }

        // Kombinierte Bedingungen
        if (a && !b) {
            System.out.println("A ist wahr UND B ist falsch, also wird dieser Code ausgeführt.");
        }

        if (a || b) {
            System.out.println("Entweder A oder B ist wahr, also wird dieser Code ausgeführt.");
        }

        // Mehrstufige Verzweigung
        int zahl = 7;
        if (zahl > 10) {
            System.out.println("Die Zahl ist größer als 10.");
        } else if (zahl > 5) {
            System.out.println("Die Zahl ist größer als 5, aber nicht größer als 10.");
        } else {
            System.out.println("Die Zahl ist 5 oder kleiner.");
        }

        // XOR-Operator (exklusives Oder)
        boolean xorResult = a ^ b;
        System.out.println("A XOR B: " + xorResult); // true, da genau ein Wert wahr ist

        // Ternärer Operator als Kurzform von If-Else
        String ergebnis = (a && b) ? "Beide sind wahr" : "Mindestens einer ist falsch";
        System.out.println("Ternärer Operator: " + ergebnis);

        // Komplexe If-Bedingungen mit logischen Operatoren
        if (a && b || c) {
            System.out.println("(A UND B) ODER C ist wahr.");
        } else {
            System.out.println("(A UND B) ODER C ist falsch.");
        }

        if (a && (b || c)) {
            System.out.println("A ist wahr UND (B ODER C) ist wahr.");
        } else {
            System.out.println("A ist nicht wahr oder (B ODER C) ist nicht wahr.");
        }

        if (!(a && b) || c) {
            System.out.println("NICHT (A UND B) ODER C ist wahr.");
        } else {
            System.out.println("NICHT (A UND B) ODER C ist falsch.");
        }
    }

}
