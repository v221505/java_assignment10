public class UC_3 {
    public static void main(String[] args){
        //constants

        int IS_PART_TIME=1;
        int IS_FULL_TIME =2;
        int EMP_RATE_PER_HOUR =20;

        // VARIABLES

        int empHrs =0;
        int empWage =0;
        Double empcheck = Math.floor(Math.random() *10) %3;

        if(empcheck ==IS_FULL_TIME )

            empHrs =8;
        else if (empcheck ==IS_PART_TIME)
            empHrs = 4;

        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage:"+ empWage);

    }

}
