package com.example.task3_depi

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githubreposappdepiround2.R
import com.example.task3_depi.ui.theme.Task3_DEPITheme

@Composable
fun IssueItem(modifier: Modifier = Modifier) {
    Row (
        Modifier.fillMaxWidth()
            .padding(top = 8.dp)
            .padding(horizontal = 8.dp)
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(12.dp)

            )
    ){
        Image(
            modifier = Modifier.size(40.dp)
                .padding(start = 8.dp, top = 8.dp)
                .clip(shape = CircleShape),
            painter = painterResource(R.drawable.issue),
            contentDescription = null
        )
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Row (
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Bump werkzeug from nkn",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis

                )
                Text(
                    text = "Open",
                    modifier=Modifier.padding(start = 50.dp, end=8.dp)
                    )
            }

            Spacer(Modifier.height(2.dp))
            Text(
                text = "NONE",
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 14.sp,
                )
            )
            Spacer(Modifier.height(8.dp))
            Row {
                Text(
                    text = "Created At:",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )

                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = "2023-10-25, 18:52 PM",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 10.sp
                    )
                )
            }

        }


    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRepoItem() {
    Task3_DEPITheme {
        IssueItem()
    }

}