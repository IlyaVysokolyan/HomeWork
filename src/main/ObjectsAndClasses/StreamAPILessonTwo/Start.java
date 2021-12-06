package StreamAPILessonTwo;

import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;


public class Start {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();

        airport.getTerminals().stream()
                .forEach(s->s.getFlights()
                        .stream().filter(t->t.getType().equals(Flight.Type.DEPARTURE))
                        .filter(f->f.getDate().getTime()>System.currentTimeMillis()&&f.getDate().getTime()<System.currentTimeMillis()+7200000)
                        .forEach(System.out::println));









    }
}
