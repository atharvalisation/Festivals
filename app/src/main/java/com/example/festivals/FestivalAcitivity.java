package com.example.festivals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FestivalAcitivity extends AppCompatActivity {

    TextView heading, description;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival_acitivity);

        heading = findViewById(R.id.heading);
        description = findViewById(R.id.description);
        image = findViewById(R.id.festivalimage);

        // Retrieve the festival name from the intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("festivalName")) {
            String festivalName = intent.getStringExtra("festivalName");

            int index = 0;

            String[] festivalNames = {
                    "Holi Festival",
                    "Diwali Festival",
                    "Dussehra Festival",
                    "Eid Festival",
                    "Christmas Day",
                    "Pongal Festival",
                    "Ganesh Chaturthi",
                    "Durga Puja",
                    "Baisakhi Festival",
                    "Lohri Festival",
                    "Easter Festival",
                    "Onam Festival",
                    "Buddha Purnima",
                    "Raksha Bandhan",
                    "Krishna Janmashtami",
                    "Chhath Puja",
                    "Maha Shivratri",
                    "Bihu Festival",
                    "Makar Sankranti",
                    "Hemis Festival",
                    "Losar Festival",
                    "Hornbill Festival",
                    "Saraswati Puja",
                    "Navratri Festival",
                    "Teej Festival",
                    "Ram Navami",
                    "Karva Chauth",
                    "Saga Dawa",
                    "Dree Festival",
                    "Mahavir Jayanti"
            };

            String[] festivalImages = {
                    "holifestival",
                    "diwalifestival",
                    "dusherafestiva",
                    "eidfestival",
                    "christmasfestival",
                    "pongalfestival",
                    "ganeshfestival",
                    "durgafestival",
                    "baisakhifestival",
                    "lohrifestival",
                    "easterfestival",
                    "onamfestival",
                    "budhapurnimafestival",
                    "rakshabandhanfestival",
                    "janmashtamifestival",
                    "chhathpujafestival",
                    "mahashivratrifestival",
                    "bihufestival",
                    "makarsankrantifestival",
                    "hemisfestival",
                    "losarfestival",
                    "hornbillfestival",
                    "saraswatipujafestival",
                    "navaratifestival",
                    "teejfestival",
                    "raamnavamifestival",
                    "karvachauthfestival",
                    "sagafestival",
                    "dreefestival",
                    "mahavirfestival"
            };

            String[] festivalDescription = {
                    "Holi is one of the most awaited festivals in India. Also referred to as the festival of love and colours, Holi signifies the victory of good over evil, the eternally divine and pure love shared between Radha and Krishna and the blossoming of the spring season. The official Holi Festival licks off a night before the main day, during the Holika Dahan ceremony. People light up a bonfire symbolic of the killing of Holika, the sister of demon king Hiranyakashyap. The other day people smear each other with vibrant colours, prepare delicious food and exchange gifts.",
                    "Also known as Deepavali or the festival of lights, Diwali is another one of the most prominent festivals in India. Celebrated according to the Hindu Lunisolar months of Ashvin and Kartik the festival is symbolic of victory of light over darkness, good over evil and knowledge over ignorance. The festival is associated with goddess Lakshmi and Lord Ganesh and the welcoming back of Lord Ram to his kingdom in Ayodhya after having defeated Ravana and completing an exile of 14 years.",
                    "Celebrated at the end of Navratri every year, and also known as Vijayadashami, this Hindu festival is observed on the 10th day of the Ashvin month. Vijayadashami is celebrated for different reasons throughout the Indian subcontinent where people give different names to their faith. For example, in northern India, this festival marks the end of Durga Puja, in other parts of the country, it is referred to as Dussehra that is commemorated by Ramlila performances etc.",
                    "Literally translating into – the festival of breaking fast, Eid al-Fitr is one of the 2 major Islamic festivals celebrated by the Muslim Community at a very large scale in India and across the globe as well. The festival marks the end of the holy Muslim month of fasting or Ramadan. This is the time when the people visit each other, wear new clothes, exchange gifts and break the fast by making elaborate, wholesome and nutritious meals.",
                    "As the end of the year draws closer, the bells of Christmas start ringing in everyone’s ear. Christmas is annually celebrated on 25th December which commemorates the birth of baby Jesus. The term Christmas term literally means mass on Christ’s day. People celebrate the day by decorating their houses in colourful lights, wreaths and flowers. Many people customarily also bring in a Christmas tree and decorate it with sparkly colored decorations. People visit churches and give gifts to each other.",
                    "Pongal is a much awaited and one of the most widely celebrated Tamil multi day Hindu harvest festivals in India. Also celebrated in Sri Lanka, Pongal starts off by the end of at the beginning of the Tai month according to the Tamil solar calendar that falls typically during the winter month of January. Dedicated to the sun god or Surya Dev, the festival corresponds with the north Indian festival of Makar Sankranti.",
                    "Ganesh Chaturthi is one of the most beloved festivals in north and central India. On this 10-day festival people celebrate the birth of the elephant-headed Hindu deity, Lord Ganesh. Lord Ganesh is the god of prosperity, wisdom and someone who removes obstacles from life. The festival kicks off on the 4th day of the month of Bhadrapada and ends when the idols of the lord are immersed in water bodies, symbolising his home journey back to his abode in Mount Kailash.",
                    "Durga puja or the Durgotsav is an annual Hindu festival whose roots can be traced back to the prehistoric times. As the name suggests the festival pays homage to goddess Durga and also celebrates her victory over the demon Mahishasura. Traditionally celebrated by the Bengali community of West Bengal, Bihar, Jharkhand, Assam, Tripura, Bangladesh etc. the festival takes place in the Ashvin months of the Hindu calendar. During the 10 days of this festival various rituals and offerings to the goddess take place.",
                    "The Vaisakh Festival is a marker of the first day of the month of Vaisakh which annually takes place during the month of April. This spring harvest festival is rooted primarily to the northern regions. Other Indian cultures and diaspora also celebrate this festival in their own way. Mainly celebrated by the Sikh community, during this festival, they hold Kirtans, visit local Gurudwaras, Socialise and share festive foods.",
                    "Most of the festivals in India are rooted in celebrating agriculture and Lohri is one such popular winter Punjabi folk festival. The Lohri festival marks the end of the harsh cold winter season and welcomes the sun’s journey to the northern hemisphere. It takes place just one night prior to Makar Sankranti where people light up a large bonfire and throw handfuls of grains in it to bless the coming of the new agricultural season and harvest.",
                    "After Christmas, Easter is another one of the major holidays or feasts of Christianity. It marks the resurrection of Jesus 3 days after his death due to crucifixion. Easter comes from the term eostre, a goddess who is celebrated at the beginning of the spring season. Easter also comes with many traditions which can be traced back to the custom folks. To celebrate Easter people normally do fun Easter egg hunts and make deliciously eloquent feasts.",
                    "Celebrated majorly by the Malyali community of the people of Kerala in South India, Onam is celebrated widely to mark the welcoming of their great king Mahabali. This 10 day long festival is celebrated with incredible splendour and is also said to mark the beginning of the much awaited harvest season. This official festival of the state is also known for being the South Indian New Year. The celebrations include cultural parade, making of flower Rangolis, traditional folk musical and dance performances, boat race, tiger dance and more.",
                    "Also referred to as Buddha Jayanti, Buddha Purnima marks the day of enlightenment of Gautama Buddha, which had a strong impact on the spirituality of the world as a whole. This Buddhist festival is largely celebrated in the east and South Asian community as the birthday of Siddhartha Gautama in Lumbini, Nepal. The exact date for the Buddha’s birth is dependent on the Asian Lunisolar calendars. In some parts of the subcontinent this day is also celebrated as a part of Vesak.",
                    "Raksha Bandhan or Rakhi is a major traditional Hindu annual ceremony that takes place between brother and sister. On this day sisters of all ages tie up a talisman or an amulet called Rakhi on their brother’s wrist. This symbolises the brother’s promise to protect the sister. In return to tying rakhi the sisters also receive gifts and blessings with a promise of sharing the responsibility in the future. Observed on the last day of Shravan, this brother sister festival finds its origins in the folk Indian culture.",
                    "Dedicated to Lord Krishna, Krishna Janmashtami is the day that celebrates the birthday of Lord Krishna. This annual Hindu festival is all about celebrating the occasion of birth of the 8th avatar of Lord Vishnu i.e. Krishna to Yashoda Mata. The day is observed on the 8th Tithi of the Krishna Paksha in the Shravana Masa. On the day of Krishna Janmashtami, people offer prayer to the lord, chant his name and sing devotional songs. This Janmashtami celebration is followed by Nand Utsav celebrations the next day.",
                    "Chhath Puja is an ancient Hindu festival that is historically natuve to the Indian state of Bihar, UP, West Bengal, Jharkhand and certain Nepalese provinces. The puja is dedicated to the sun god or Surya Dev, as a way of offering gratitude and thankfulness to the sun deity for bestowing a bountiful life on earth. Celebrated 6 days after Diwali, environmentalists have claimed that Chhath is one of the most eco-friendly religious festivals in the world. The rituals include bathing, fasting, abstaining from drinking water, standing in water, offering prayer etc.",
                    "Honouring the destroyer, Lord Shiva, this Hindu festival is celebrated annually throughout the subcontinent in different ways. Shivratri translates into – the night of Shiva, this festival takes place on the day prior to the new moon. On this great night of Shiva, every devotee of the Shaivite community remembers the powerful Lord Shiva by fasting, chanting prayers, meditating, doing charity work etc. This is an integral festival in Hinduism whose origin predates recorded history.",
                    "The Bihu festival of north east India is one of the most prominent festivals in the subcontinent that is primarily observed by the local Assamese people. Bihu is a set of 3 major Assamese festivals of Rongali, Kongali and Bhogali that takes place primarily during the peak winter month of January. Every aspect of the celebrations and rituals reflect influences from south East Asia and Sino-Tibetan cultures. Normally the term Bihu only signifies the Assamese Dance form but it is way more than that.",
                    "Also simply referred to as Sankranti or Til Sankranti, this day is an important event in the year. The day Makar Sankranti is celebrated traditionally marks the transition day of the sun into Capricorn. During this time, as per calculations, the sun moves northwards and transits into Makara Rashi or Capricorn. Different names are given to Makar Sankranti depending on the region as to where it is celebrated for example it is known as Uttarayan in Jammu and UP, Pongal in Tamil Nadu, Sakraat in Rajasthan and so on.",
                    "The Hemis festival takes place in one of the most visited monasteries in Ladakh i.e. the Hemis monastery. This is one of the most important Buddhist festivals as it marks the birth of Guru Padmasambhava. The festival is a grand 2 days event that takes place on the 10th day of the 5th month of the Tibetan calendar. The Hemis Gompa turns into a grand stage where people partake in the traditional Cham and mask dance performances, Tibetan musical performances and more. The main event of the festival is the public unfurling of the largest Thangka in Ladakh on a duration of every 12th year.",
                    "Losar or the Tibetan New Year is one of the major festivals celebrated by the followers of Tibetan Buddhism. The holiday is a new year’s festival that predates the arrival of Buddhism in Tibet. The festival has its roots in the incense burning custom of the bon religion. Celebrated for a duration of 15 days the main celebrations take place on the first 3 days. This event is marked with ancient ceremonies and practices representing the struggle between good and evil. The dance movements and theatrical performances that takes place in the courtyard of the monasteries is a mesmerising sight to behold.",
                    "Organised each year by the government of Nagaland, the hornbill festival is unlike any other festival in India or in the world. The festival is a way of restoring and preserving the culture, faith and traditions of our Naga neighbours that are tucked away in the deep core hills of North East India. The various tribes of Nagaland perform their local dance, musical and theatrics acts. Nagaland is known as the land of festivals where people celebrate every festival with great passion and enthusiasm. This festival is the perfect celebration of local culture and heritage throughout the centuries. People can go there and have the time of their life while being surrounded with cultural experiences.",
                    "Mostly celebrated as a Basant Panchami in north India, this festival is a marker for the arrival of spring season. As the name suggests this puja honours Saraswati Mata, and kicks off the preparation for Holika and Holi festivals that is set to take place 40 days later. Celebrated among the Sikh and Hindu folks of the subcontinent, people offer their prayer to the goddess of knowledge, music and all arts, Saraswati Mata. She symbolises creative energy, power, longing and love. People dress up in yellow clothes and eat yellow food as well.",
                    "Spanning over a duration of 9 days, the festival of Navratri has to be undoubtedly one of the most awaited celebrations in India. These 9 holy nights are dedicated to the 9 different forms of goddess Durga. The term Navratri literally translates into 9 nights where Nav means 9 and Ratri means night. Celebrations of Navratri include stage decorations, legend recital, enacting of the story and chanting mantras from scriptures etc. people dance around traditional and devotional music which is truly a really fun experience. From playing Gujarat to performing fun rituals till the end of the day, Navratri is one of the most fun filled festival experiences in India.",
                    "There are two variations of the Teej Festival celebrated in India namely, Hariyali and Hartalika. Celebrated by married women and girls of the Hindu community, the festival welcomes the monsoon season. They sing, dance, observe fast, offer prayers, meditate and listen to devotional music. This festival is dedicated to goddess Parvati and her reunion with lord Shiva. Teej refers to the monsoon festivals, observed primarily in the North Indian states and Nepal. Women wear 16 Shringar and put Mehndi to honour their marital status and give their husband longevity.",
                    "Ram Navami is one of the most iconic Hindu festivals in India. Celebrating the birth of Lord Ram, the 7th avatar of Vishnu, this festival is a part of the Chaitra Navratri in the spring. The day is marked by Ram Katha recitals or the chanting of the stories involving the greatness of lord ram this also includes the recitation of the Hindu epic of Ramayan. Important celebrations take place at Ram Janmabhoomi in Ayodhya and other temples across India that are dedicated to Lord Ram.",
                    "Celebrated by the married Hindu women of north and west India, Karwa Chauth is another one of the major festivals. The festival traditionally falls on the 4th day of the full moon. During this day married women keep a fast, without drinking water, for the whole day from sunrise to moonrise. Locally this fasting festival is followed by the people in the states of Delhi, Punjab, Rajasthan, Haryana, UP, Himachal Pradesh, Madhya Pradesh etc. The term Karwa is another word for a pot and Chauth means fourth. Women set up Puja Ki Thali, Put Mehndi, and dress up in traditional married women’s attire and break their fast by looking through a sieve to their husband.",
                    "Saga Dawa is one of the most famous and biggest festivals in Sikkim. The festival is considered to be incredibly sacred and prominent for the followers of the Mahayana sect of Buddhism. The occasion celebrates the auspicious moment when Buddha had attained his enlightenment that in turn had set forth the wheel of dharma. The Saga Dawa Festival offers the perfect platform of visual treat for various religious ceremonies and street processions. It is also one of the main festivals celebrated among the Hindu Nepalese community of Sikkim that takes place in the month of October. Travellers should make their way to Pelling monastery in Sikkim for a more up close and personal experience of the festival.",
                    "The epicentre for the Dree festival celebrations is the Ziro Valley in Arunachal Pradesh. Celebrated by the Apatanis of this region, Dree is an agricultural festival which is considered as the highlight for the agricultural cycles. As a part of the festival the people worship and offer their honours to the 5 primary deities namely Tamu, Metii, Meder, Mepin and Danyi. All these gods help with a healthy growth of crops and create a favourable environment, free of pests and insects, to grow a good quality of crop. The venue for this festival is the centre of the valley and it contains fun entertainment activities and performances such as sporting activities, dancing, and musical performances, unfurling of the Dree Flag etc. literary competitions and recitations is also a major part of this festival. Women folk, as a part of the ritualistic traditions, go to their elderly and present them with wine as a way of showing respect to them and strengthening their bond.",
                    "Celebrated by the Jain community of the subcontinent, Mahavir Jayanti marks the birth anniversary of the founder of Jainism. Famous as one of the most auspicious festivals for the Jain community, the people come together to observe peace, harmony and spread the teachings of Mahavir, the 24th Jain Tirthankar. As per the holy Jain texts and scriptures, Mahavir was born on the 13th day of the bright half-moon in the Chaitra month. The celebrations include carrying out the idol of Lord Mahavir on an ornate chariot called a Rath Yatra. The idol is given a ceremonial Abhishekam and during the day, many Jain people engage in giving and charity activities."
            };



            for(int i = 0 ; i < festivalNames.length ; i++)
            {
                if(festivalName.equals(festivalNames[i]))
                {
                    index = i;
                    break; // Once found, no need to continue searching
                }
            }

            String imageName = festivalImages[index]; // Assuming 'index' is the index of the selected festival
            int imageResource = getResources().getIdentifier(imageName, "drawable", getPackageName());
            image.setImageResource(imageResource);

            heading.setText(festivalNames[index]);
            description.setText(festivalDescription[index]);

        }
    }

    public void openHome(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void opengallery(View view) {
        Intent i = new Intent(this, Gallery.class);
        startActivity(i);
    }

    public void openlist(View view) {
        Intent i = new Intent(this, FestivalList.class);
        startActivity(i);
    }

    public void opensearch(View view) {
        Intent i = new Intent(this, SearchFestival.class);
        startActivity(i);
    }
}