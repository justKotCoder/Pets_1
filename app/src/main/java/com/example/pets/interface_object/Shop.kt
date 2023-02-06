package com.example.pets.interface_object


import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pets.R

//Поиск
@Preview(showBackground = true)
@Composable
fun Search() {
    var text by remember {
        mutableStateOf("")
    }
    TextField(
        value = text,
        onValueChange ={text=it},
        leadingIcon = { Icon(Icons.Filled.Search, contentDescription = "Поиск") },
        shape = RoundedCornerShape(20.dp),
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Gray,

            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        modifier = Modifier.width(285.dp)



    )

}

//Аккаунт
//@Preview(showBackground = true)
@Composable
fun Profile(){
    OutlinedButton(onClick = {},
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.Font)),
        modifier= Modifier.size(50.dp),
        shape = CircleShape,
        contentPadding = PaddingValues(0.dp),
    ) {
        // Adding an Icon "Add" inside the Button
        Icon(painter = painterResource(id = R.drawable.icon_profil) ,contentDescription = "content description", tint = Color.White)
    }
}

//Фильтер
@Preview(showBackground = true)
@Composable
fun Filter(){
    Button(onClick = {},
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.Font), contentColor = Color.Black),
        contentPadding = PaddingValues(0.dp),
    ) {
        Row() {
            Icon(painter = painterResource(id = R.drawable.icon_filter) ,contentDescription = "content description",tint= Color.White
                , modifier = Modifier.padding(start = 10.dp,top=4.dp))
            Text(text = "Фильтр", modifier = Modifier.padding(start = 9.dp, end = 12.dp,top=1.dp), color = Color.White )
        }
      //  Icon(Icons.Filled.Person ,contentDescription = "content description",tint= Color.Gray)
    }
}


//Отмена фильтра
@Preview(showBackground = true)
@Composable
fun Filter_Back(){
    Button(onClick = {},
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.Font), contentColor = Color.Black),
        contentPadding = PaddingValues(0.dp),
        modifier = Modifier.width(115.dp)
    ) {
            Text(text = "Сбросить", color = Color.White)
    }
}

//Товар
@Preview(showBackground = true)
@Composable
fun Tovar(){
    var price by remember {
        mutableStateOf( "150 p")
    }
    var star_price by remember {
        mutableStateOf("1350 p")
    }
    var Name by remember {
        mutableStateOf("Quente")
    }
    var Opicanie by remember {
        mutableStateOf("Ошейник кожаный для собак средних и крупных пород")
    }
    var Ozenka by remember {
        mutableStateOf(3.5)
    }
    Column(
        Modifier
            .width(168.dp)
            .height(276.dp)
            .clip(RoundedCornerShape(20.dp))
            //.background(color = Color.Gray),
        ) {
        Box(
            Modifier
                .height(156.dp)
                .clip(RoundedCornerShape(20.dp))) {
            Image(painter = painterResource(id = R.drawable.not_foto),
                contentDescription ="",
                contentScale = ContentScale.Crop)
        }
        Row(Modifier.padding(top=3.dp, start = 5.dp), verticalAlignment = Alignment.Bottom) {
            Text(text = price, fontSize = 22.sp)
            Text(text = star_price, fontSize = 14.sp,textDecoration = TextDecoration.LineThrough, modifier = Modifier.padding(start = 8.dp), color = Color.Gray)
        }
        Text(text = Name,Modifier.padding(start = 5.dp).height(16.dp), color = colorResource(id =R.color.Font),fontSize=12.sp)
        Text(text = Opicanie,Modifier.padding(start = 5.dp,end=6.dp).height(32.dp), fontSize =10.sp, lineHeight = 12.sp )
        Row(
            Modifier
                .padding(start = 5.dp, top = 4.dp, end = 6.dp)
                .height(15.dp)) {
            Icon(painter = painterResource(id = R.drawable.ozenka), tint = Color.Yellow ,contentDescription = "content description")
            Icon(painter = painterResource(id = R.drawable.ozenka), tint = Color.Yellow ,contentDescription = "content description")
            Icon(painter = painterResource(id = R.drawable.ozenka), tint = Color.Yellow ,contentDescription = "content description")
            Icon(painter = painterResource(id = R.drawable.ozenka),contentDescription = "content description" )
            Icon(painter = painterResource(id = R.drawable.ozenka),contentDescription = "content description" )
            Icon(painter = painterResource(id = R.drawable.icon_cart) ,contentDescription = "content description", modifier = Modifier.padding(start=45.dp))
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Spucok() {
    Column() {
        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()){
            Tovar()

            Tovar()
        }
    }
}