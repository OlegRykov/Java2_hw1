package enumHw;

public enum DayOfWeek {
    Monday(40), Tuesday(32), Wednesday(24), Thursday(16),
    Friday(8), Saturday(0), Sunday(0);

    private int workingHours;

    DayOfWeek(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void workingHoursLeft() {
        if (workingHours > 0){
            System.out.println("До выходных осталось: " + workingHours + " часа(ов).");
        }else {
            System.out.println("Сегодня выходной.");
        }
    }
}
