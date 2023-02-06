package com.example.pets.interface_object

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColor
import androidx.core.graphics.toColorInt
import com.example.pets.R
import com.example.pets.modifier.*

@Composable
@Preview(showBackground = true)
fun image_tovara(){
    Box(
        Modifier
            .width(327.dp)
            .height(257.dp)
            .clip(RoundedCornerShape(18.dp))
    ){
        Image(painter = ColorPainter(Color.Transparent), contentDescription = null)

    }
}


@Composable
@Preview(showBackground = true)
fun color_tovar() {
    var a: Color? = null


    Box(modifier = Modifier
        .width(28.dp)
        .height(25.dp)
        .background(Color.Yellow)
        .clip(RoundedCornerShape(9.dp))
        .clickable { }
    )
}

var a="Ошейник из натуральной кожи для собак средних и больших пород"
@Composable
@Preview(showBackground = true)
fun name_tovara(Name:String=a){
    var string =Name
    Text(text = string, fontSize = 19.sp, modifier = Modifier
        .width(275.dp)
        .height(48.dp))
}

var a1="Ciprino Dorato"
@Composable
@Preview(showBackground = true)
fun producer_tovar(Name: String=a1){
        var string =Name
        Text(text = string, fontSize = 14.sp, modifier = Modifier
            .width(93.dp)
            .height(20.dp))
}


var Text_tovara="Ошейник из натуральной кожи для собак средних и больших пород.Ошейник из натуральной кожи для собак средних и больших пород.Ошейник из натуральной кожи для собак средних и больших пород."
@Composable
@Preview(showBackground = true)
fun opicanie_tovara(Characteristic:String= Text_tovara){
    var string =Characteristic
    Text(text = string, fontSize = 12.sp, modifier = Modifier
        .width(275.dp)
        .height(69.dp))
}
@Composable
@Preview(showBackground = true)
fun button_shop(){
    Button(
        modifier = Modifier
            .width(227.dp)
            .height(43.dp)
            .clip(RoundedCornerShape(18.dp)),
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Gray,
            contentColor = Color.Black)
    )
    {
        Text(text = "В корзину", fontSize = 22.sp)
    }
}
@Composable
@Preview(showBackground = true)
fun like_shop(){
    Button(
        modifier = Modifier
            .width(43.dp)
            .height(43.dp)
            .clip(RoundedCornerShape(13.dp)),
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Gray,
            contentColor = Color.Black),
        contentPadding = PaddingValues(8.dp)
    )
    {
        Icon(painter = painterResource(id = R.drawable.icon_love), contentDescription =null,Modifier.fillMaxSize() )
    }
}

var parameter_1="Параметр hhhhhhhhhh "
var parameter_znachenie="2.4 кг"
@Composable
@Preview(showBackground = true)
fun parameter_tovara(parameter: String= parameter_1,znachenie:String= parameter_1){
    Row(
        Modifier
            .width(285.dp)
            .height(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = parameter_1, fontSize = 14.sp )
        Box(
            Modifier
                .height(1.dp)
                .fillMaxWidth(0.5f)
                .background(Color.Gray, shape = DottedShape(step = 10.dp))
        )
        Text(text = parameter_znachenie, fontSize = 14.sp, modifier = Modifier.fillMaxWidth(1f))
    }
}
