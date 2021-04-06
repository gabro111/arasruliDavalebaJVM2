package ge.btu.nika.gabrichidze.currency.controller;
import ge.btu.nika.gabrichidze.currency.model.Currency;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/HelloWorld")
public class Controller {

    @GET
    @Path("/hi")
    public String sayHallo(){
        return "Hello !";
    }
    @GET
    @Path("/Currency")
    @Produces(MediaType.APPLICATION_JSON) // აბრუნებს ჯეისონს
    public List<Currency> getCurrency() {
        List<Currency> CurrencyList=new ArrayList<>();
        CurrencyList.add(new Currency(3.4,"USD"));
        CurrencyList.add(new Currency(3.6,"EUR"));
        return (CurrencyList);
    }

}