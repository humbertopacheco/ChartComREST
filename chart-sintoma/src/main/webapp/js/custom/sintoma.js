/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var CONSERPRO_SINTOMAS = {
    /*Makes the AJAX call (synchronous) to load a Student Data*/
    loadSintomasData: function () {
        var formattedstudentListArray = [];
        $.ajax({
            async: false,
            //url: "StudentJsonDataServlet",
            url: "http://localhost:8080/chart-sintoma-rest/rest/service/execute",
            dataType: "json",
            method: "get",
            success: function (sintomaJsonData) {

                console.log(sintomaJsonData);

                $.each(sintomaJsonData, function (index, sintoma) {
                    formattedstudentListArray.push([sintoma.qtdeCasosJaneiro, sintoma.qtdeCasosFevereiro, sintoma.qtdeCasosMarco, sintoma.qtdeCasosAbril, sintoma.qtdeCasosMaio, sintoma.qtdeCasosJunho]);
                });
            }
        });
        return formattedstudentListArray;
    },
    /*Crate the custom Object with the data*/
    createChartData: function (jsonData) {
        console.log(jsonData);

        return {
            labels: ["Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"],
            datasets: [
                {
                    label: "My First dataset",
                    fillColor: "rgba(255, 139, 141, 0.3)",
                    strokeColor: "rgba(220,220,220,1)",
                    pointColor: "rgba(220,220,220,1)",
                    pointStrokeColor: "#fff",
                    pointHighlightFill: "#fff",
                    pointHighlightStroke: "rgba(220,220,220,1)",
                    /*As Ajax response data is a multidimensional array, we have 'sintoma' data in 0th position*/
                    data: jsonData[0]
                },
                {
                    fillColor: "rgba(151,187,205,0.3)",
                    strokeColor: "rgba(151,187,205,1)",
                    pointColor: "rgba(151,187,205,1)",
                    pointStrokeColor: "#fff",
                    pointHighlightFill: "#fff",
                    pointHighlightStroke: "rgba(151,187,205,1)",
                    /*As Ajax response data is a multidimensional array, we have 'sintoma' data in 1th position*/
                    data: jsonData[1]
                }
            ]
        };
    },
    /*Renders the Chart on a canvas and returns the reference to chart*/
    renderSintomasChart: function (myChartData) {

        var context2D = document.getElementById("canvas").getContext("2d"),
                myRadar = new Chart(context2D).Line(myChartData, {scaleShowLabels: true, pointLabelFontSize: 10, bezierCurve: false});

        return myRadar;
    },
    /*Initalization Sintoms Render Chart*/
    initRadarChart: function () {

        var sintomasData = CONSERPRO_SINTOMAS.loadSintomasData();

        chartData = CONSERPRO_SINTOMAS.createChartData(sintomasData);

        radarChartObj = CONSERPRO_SINTOMAS.renderSintomasChart(chartData);

    }
};


$(document).ready(function () {
    CONSERPRO_SINTOMAS.initRadarChart();
});