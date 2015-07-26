/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.serpro.chart.sintoma.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Humberto
 */
@Path("/service")
public class SintomaService {

    @GET
    @Path("/verify/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response verify(@PathParam("param") String msg) {
        String output = "Jersey responde : " + msg;

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("execute")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Sintoma> execute() {

        List<Sintoma> sintomas = new ArrayList<>();

        sintomas.add(new Sintoma("Tosse", 5, 10, 10, 20, 5, 3));

        sintomas.add(new Sintoma("Febre Alta", 2, 200, 10, 5, 3, 10));

        return sintomas;

    }

}
