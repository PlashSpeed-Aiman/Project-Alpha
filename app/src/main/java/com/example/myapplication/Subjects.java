package com.example.myapplication;

public class Subjects {
    private String SubjectName;
    private String SubjectCode;
    private String description;

    private Subjects(String subjectName,String subjectCode,String description){
        this.SubjectName=subjectName;
        this.SubjectCode=subjectCode;
        this.description=description;
    }
    public static final Subjects[] firstYearSubject = {
            new Subjects("Statics", "MECH1301", String.format("%-60s", "General principles of statics, force vectors, equilibrium, analysis of trusses, frames and machines, forces and moments, friction, centroids and moment of inertia. ")),
            new Subjects("Engineering Mathematics 1", "MATH1310", "Complex numbers, vectors and geometry in space, matrix algebra, eigenvalues and eigenvectors, linear system " +
                    "of equations, differentiation and integration with applications"),
            new Subjects("Dynamics", "MECH1302", "Kinematics  of  particles  and  rigid  bodies,  kinetics  of  particles  and  rigid  bodies,  Newton’s  laws  of  motion, " +
                    "equations of motion, work and energy methods, impulse and momentum.  "),
            new Subjects("Engineering Mathematics 1", "MATH1320", "Parametric equations  and  polar  coordinates,  vectors  and geometry  in  space, multivariable  functions,  partial " +
                    "derivatives  and  multiple  integrals  with  applications,  vector  valued  functions,  vector  calculus,  infinite  and " +
                    "power  series,  ordinary  differential  equations,  series  solution,  Bessel’s  and  Legendre’s  equations,  Laplace " +
                    "transformation. ")};
    public static final Subjects[] secondYearSubject = {
            new Subjects("Thermodynamics", "BTE 2521", "Basic concepts  of  thermodynamics,  properties  of  pure  substances,  first and  second  law  of  thermodynamics, \n" +
                    "entropy, refrigeration cycles, thermodynamic relations for simple compressible substances, P‐v‐T behavior and " +
                    "properties of non‐reacting ideal gas mixtures and psychometrics, reacting mixtures and combustion, chemical " +
                    "and phase equilibrium."),
            new Subjects("Introductory Microbiology", "BTE 2440", "Introduction on general understanding of microorganisms with emphasis on bacteria, yeasts and  fungi. Study \n" +
                    "on bacterial and other microbial structure, microbial growth, physiology and ecology,  fungal, yeast and virus " +
                    "life  cycle,  antigen,  antibody  and  basics  of  immunology. Microbial  applications  in  the  area  of  food,  medical, " +
                    "biotechnology industry and environment are also studied")
    };

    public String getDescription() {
        return description;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public String getSubjectCode() {
        return SubjectCode;
    }
    public String toString() {
        return this.SubjectName;
    }
}
