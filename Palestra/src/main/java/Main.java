import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		LocalDate myDate =LocalDate.parse("2014-02-14");
//		String a =  GestorePalestra.inserisciUtente("Mario", "Rossi", "0792893", "aoshdqeqw213123","m","perugia", myDate,"studente");
//		System.out.println(a);
		
		LocalDate inizioCorso = LocalDate.parse("2018-11-03");
		LocalDate fineCorso = LocalDate.parse("2019-11-03");
		
		List<Integer> giorniLezione = new ArrayList<>();
		List<LocalTime> inizioLezione = new ArrayList<>();
		List<LocalTime> fineLezione = new ArrayList<>();
		giorniLezione.add(2,4);
		
		inizioLezione.add(LocalTime.of(15, 30));
		fineLezione.add(LocalTime.of(16, 30));
		
		inizioLezione.add(LocalTime.of(9, 30));
		fineLezione.add(LocalTime.of(10, 30));
		
		List<Lezione> listaLezioni = new ArrayList<>();
		
		for(int giorno : giorniLezione) {
			for(LocalTime inizio : inizioLezione) 
				for(LocalTime fine : fineLezione) 
					for (LocalDate date = inizioCorso; date.isBefore(fineCorso); date = date.plusDays(1)) {
						if(getDayOfWeek(giorno)==date.getDayOfWeek()) {
							listaLezioni.add(new Lezione(0,giorno,inizio,fine));
						}
			
					}
		}
		
		System.out.println(inizioCorso);
	}
private static LocalDate calcNextFriday(LocalDate d) {
	
	  return d.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
	}
private static DayOfWeek getDayOfWeek ( int i ) {

    switch (i) {
        case 1:
            return DayOfWeek.MONDAY;
        case 2:
            return DayOfWeek.TUESDAY;
        case 3:
            return DayOfWeek.WEDNESDAY;
        case 4:
            return DayOfWeek.THURSDAY;
        case 5:
            return DayOfWeek.FRIDAY;
        case 6:
            return DayOfWeek.SATURDAY;
    }

    return DayOfWeek.SUNDAY;
}

}
