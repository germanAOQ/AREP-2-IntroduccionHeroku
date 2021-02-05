$(function () {
    $("#mean").click(function (e) {
        var lista = $('#numbers').val();
        $.ajax({
            url: '/mean?list=' + lista,
            success: function (data) {
                $('#resultMean').text(data);
            }
        })
    });
    $("#stddev").click(function (e) {
        var lista = $('#numbers').val();
        $.ajax({
            url: '/stddev?list=' + lista,
            success: function (data) {
                $('#resultStddev').text(data);
            }
        })
    });
});