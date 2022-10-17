package com.mindorks.sample.whatsapp.data.local

import com.mindorks.sample.whatsapp.R
import com.mindorks.sample.whatsapp.data.model.Call
import com.mindorks.sample.whatsapp.data.model.Chat
import com.mindorks.sample.whatsapp.data.model.Conversation
import com.mindorks.sample.whatsapp.data.model.Status

val calls = mutableListOf<Call>().apply {
    add(
        Call(
            "Sundar Pichai",
            "https://en.wikipedia.org/wiki/File:Sundar_pichai.png",
            "Yesterday",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Satya Nadella",
            "https://en.wikipedia.org/wiki/File:MS-Exec-Nadella-Satya-2017-08-31-22_(cropped).jpg",
            "Friday",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Parag Agrawal",
            "https://upload.wikimedia.org/wikipedia/commons/5/56/Paragagrawalcropped.jpg",
            "Thursday",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Tim Cook",
            "https://upload.wikimedia.org/wikipedia/commons/e/e1/%D0%A2%D0%B8%D0%BC_%D0%9A%D1%83%D0%BA_%2802-09-2021%29.jpg",
            "Monday",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Mark Zuckerberg",
            "https://upload.wikimedia.org/wikipedia/commons/1/18/Mark_Zuckerberg_F8_2019_Keynote_%2832830578717%29_%28cropped%29.jpg",
            "22/04/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Elon Musk",
            "https://upload.wikimedia.org/wikipedia/commons/3/34/Elon_Musk_Royal_Society_%28crop2%29.jpg",
            "18/04/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Larry Page",
            "https://upload.wikimedia.org/wikipedia/commons/e/ec/Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg",
            "10/04/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Jeff Bezos",
            "https://upload.wikimedia.org/wikipedia/commons/6/6c/Jeff_Bezos_at_Amazon_Spheres_Grand_Opening_in_Seattle_-_2018_%2839074799225%29_%28cropped%29.jpg",
            "9/04/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Bill Gates",
            "https://upload.wikimedia.org/wikipedia/commons/a/a8/Bill_Gates_2017_%28cropped%29.jpg",
            "19/03/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Warren Buffett",
            "https://upload.wikimedia.org/wikipedia/commons/d/d4/Warren_Buffett_at_the_2015_SelectUSA_Investment_Summit_%28cropped%29.jpg",
            "15/03/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Mukesh Ambani",
            "https://upload.wikimedia.org/wikipedia/commons/6/69/Mukesh_Ambani.jpg",
            "12/03/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Gautam Adani",
            "https://upload.wikimedia.org/wikipedia/commons/f/ff/Gautam_Adani.jpg",
            "1/03/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Bernard Arnault,
            "https://upload.wikimedia.org/wikipedia/commons/d/de/Bernard_Arnault_%283%29_-_2017_%28cropped%29.jpg",
            "20/02/20",
            R.drawable.ic_down_missed
        )
    )

}

val chatsList = mutableListOf<Chat>().apply {
    add(
        Chat(
            "Sundar Pichai",
            "https://en.wikipedia.org/wiki/File:Sundar_pichai.png",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Yesterday",
            "0"
        )
    )
    add(
        Chat(
            "Satya Nadella",
            "https://en.wikipedia.org/wiki/File:MS-Exec-Nadella-Satya-2017-08-31-22_(cropped).jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Friday",
            "0"
        )
    )
    add(
        Chat(
            "Parag Agrawal",
            "https://upload.wikimedia.org/wikipedia/commons/5/56/Paragagrawalcropped.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Thursday",
            "2"
        )
    )
    add(
        Chat(
            "Tim Cook",
            "https://upload.wikimedia.org/wikipedia/commons/e/e1/%D0%A2%D0%B8%D0%BC_%D0%9A%D1%83%D0%BA_%2802-09-2021%29.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Monday",
            "5"
        )
    )
    add(
        Chat(
            "Mark Zuckerberg",
            "https://upload.wikimedia.org/wikipedia/commons/1/18/Mark_Zuckerberg_F8_2019_Keynote_%2832830578717%29_%28cropped%29.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "22/04/20",
            "6"
        )
    )
    add(
        Chat(
            "Elon Musk",
            "https://upload.wikimedia.org/wikipedia/commons/3/34/Elon_Musk_Royal_Society_%28crop2%29.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "18/04/20",
            "7"
        )
    )
    add(
        Chat(
            "Larry Page",
            "https://upload.wikimedia.org/wikipedia/commons/e/ec/Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "10/04/20",
            "1"
        )
    )
    add(
        Chat(
            "Jeff Bezos",
            "https://upload.wikimedia.org/wikipedia/commons/6/6c/Jeff_Bezos_at_Amazon_Spheres_Grand_Opening_in_Seattle_-_2018_%2839074799225%29_%28cropped%29.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "9/04/20",
            "0"
        )
    )
    add(
        Chat(
            "Bill Gates",
            "https://upload.wikimedia.org/wikipedia/commons/a/a8/Bill_Gates_2017_%28cropped%29.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "19/03/20",
            "0"
        )
    )
    add(
        Chat(
            "Warren Buffett",
            "https://upload.wikimedia.org/wikipedia/commons/d/d4/Warren_Buffett_at_the_2015_SelectUSA_Investment_Summit_%28cropped%29.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "15/03/20",
            "2"
        )
    )
    add(
        Chat(
            "Mukesh Ambani",
            "https://upload.wikimedia.org/wikipedia/commons/6/69/Mukesh_Ambani.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "12/03/20",
            "5"
        )
    )
    add(
        Chat(
            "Gautam Adani",
            "https://upload.wikimedia.org/wikipedia/commons/f/ff/Gautam_Adani.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "1/03/20",
            "3"
        )
    )
    add(
        Chat(
            "Bernard Arnault,
            "https://upload.wikimedia.org/wikipedia/commons/d/de/Bernard_Arnault_%283%29_-_2017_%28cropped%29.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "20/02/20",
            "9"
        )
    )


}.toList()

val statusList = mutableListOf<Status>().apply {
    add(
        Status(
            "Sundar Pichai",
            "https://en.wikipedia.org/wiki/File:Sundar_pichai.png",
            "Today, 4.50 pm"
        )
    )
    add(
        Status(
            "Satya Nadella",
            "https://en.wikipedia.org/wiki/File:MS-Exec-Nadella-Satya-2017-08-31-22_(cropped).jpg",
            "Today, 10.00 am"
        )
    )
    add(
        Status(
            "Parag Agrawal",
            "https://upload.wikimedia.org/wikipedia/commons/5/56/Paragagrawalcropped.jpg",
            "Thursday"
        )
    )
    add(
        Status(
            "Tim Cook",
            "https://upload.wikimedia.org/wikipedia/commons/e/e1/%D0%A2%D0%B8%D0%BC_%D0%9A%D1%83%D0%BA_%2802-09-2021%29.jpg",
            "Monday"
        )
    )
    add(
        Status(
            "Mark Zuckerberg",
            "https://upload.wikimedia.org/wikipedia/commons/1/18/Mark_Zuckerberg_F8_2019_Keynote_%2832830578717%29_%28cropped%29.jpg",
            "22/04/20"
        )
    )
    add(
        Status(
            "Elon Musk",
            "https://upload.wikimedia.org/wikipedia/commons/3/34/Elon_Musk_Royal_Society_%28crop2%29.jpg",
            "18/04/20"
        )
    )
    add(
        Status(
            "Larry Page",
            "https://upload.wikimedia.org/wikipedia/commons/e/ec/Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg",
            "10/04/20"
        )
    )
    add(
        Status(
            "Jeff Bezos",
            "https://upload.wikimedia.org/wikipedia/commons/6/6c/Jeff_Bezos_at_Amazon_Spheres_Grand_Opening_in_Seattle_-_2018_%2839074799225%29_%28cropped%29.jpg",
            "9/04/20"
        )
    )
    add(
        Status(
            "Bill Gates",
            "https://upload.wikimedia.org/wikipedia/commons/a/a8/Bill_Gates_2017_%28cropped%29.jpg",
            "19/03/20"
        )
    )
    add(
        Status(
            "Warren Buffett",
            "https://upload.wikimedia.org/wikipedia/commons/d/d4/Warren_Buffett_at_the_2015_SelectUSA_Investment_Summit_%28cropped%29.jpg",
            "15/03/20"
        )
    )
    add(
        Status(
            "Mukesh Ambani",
            "https://upload.wikimedia.org/wikipedia/commons/6/69/Mukesh_Ambani.jpg",
            "12/03/20"
        )
    )
    add(
        Status(
            "Gautam Adani",
            "https://upload.wikimedia.org/wikipedia/commons/f/ff/Gautam_Adani.jpg",
            "1/03/20"
        )
    )
    add(
        Status(
            "Bernard Arnault,
            "https://upload.wikimedia.org/wikipedia/commons/d/de/Bernard_Arnault_%283%29_-_2017_%28cropped%29.jpg",
            "20/02/20"
        )
    )

}.toList()


val chat = mutableListOf<Conversation>().apply {
    add(Conversation(1, "Hey"))
    add(Conversation(2, "Hey"))
    add(Conversation(1, "Wassup"))
    add(Conversation(1, "How have you been?"))
    add(Conversation(2, "I am good"))
    add(Conversation(1, "Hey"))
    add(Conversation(2, "Hey"))
    add(Conversation(1, "Wassup"))
    add(Conversation(1, "How have you been?"))
    add(Conversation(2, "I am good"))
    add(Conversation(1, "Hey"))
    add(Conversation(2, "Hey"))
    add(Conversation(1, "Wassup"))
    add(Conversation(1, "How have you been?"))
    add(Conversation(2, "I am good"))
}

fun addChat(text: String) = chat.add(Conversation(1, text))