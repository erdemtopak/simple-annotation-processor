Simple Annotation Processor
===========================
A simple annotation processor example, inspired by the idea of "**How ButterKnife works?**"

In this sample project there are two self-explaining annotations : ```@RandomInt``` and ```@RandomString```

They will be used as markers to generate random integers and strings for annotated fields on compile time. 

Simple usage of them: 

```Java

public class TestActivity extends AppCompatActivity {
    
    @RandomInt
    String randomInteger;
    
    @RandomInt(minValue = 1, maxValue = 100)
    int randomIntegerBetween1and100;
    
    @RandomString
    String randomString;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Randomizer.bind(this);
        //... application code
    }
}

```