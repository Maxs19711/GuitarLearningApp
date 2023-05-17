package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private Button button2,button3,button21;
    HorizontalScrollView hsl;
    HorizontalScrollView hsl2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button3 = findViewById(R.id.button1);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        button21=findViewById(R.id.button3);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });

        hsl = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);
        LinearLayout l1 = (LinearLayout)findViewById(R.id.linearLayout2);
        hsl2 = (HorizontalScrollView) findViewById(R.id.horizontalScrollView2);
        LinearLayout l11 = (LinearLayout)findViewById(R.id.linearr);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        final int width = size.x;

        Button c11 = (Button) findViewById(R.id.c1);
        Button c22 = (Button) findViewById(R.id.c2);
        Button c33 = (Button) findViewById(R.id.c3);
        Button c44 = (Button) findViewById(R.id.c4);
        Button c55 = (Button) findViewById(R.id.c5);
        Button c66 = (Button) findViewById(R.id.c6);
        Button c77 = (Button) findViewById(R.id.c7);
        Button c88 = (Button) findViewById(R.id.c8);
        Button c99 = (Button) findViewById(R.id.c9);
        Button c10 = (Button) findViewById(R.id.c10);
        Button c101 = (Button) findViewById(R.id.c11);
        Button c102 = (Button) findViewById(R.id.c12);
        Button m111 = (Button) findViewById(R.id.m1);
        Button m222 = (Button) findViewById(R.id.m2);
        ImageButton j1 = (ImageButton) findViewById(R.id.sound);

        //ImageView i1 = (ImageView) findViewById(R.id.imageView3);
        ImageView img;
        img = (ImageView) findViewById(R.id.imageView3);
        //c22.setSelected(true);
        //m11.setSelected(true);
       /* if(m11.hasOnClickListeners()){
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c11.getLeft() - (width/2)+(c11.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.c1);
                }
            });

            c22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c22.getLeft() - (width/2)+(c22.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.c2);
                }
            });

            c33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c33.getLeft() - (width/2)+(c33.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.d1);
                }
            });

            c44.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c44.getLeft() - (width/2)+(c44.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.d2);
                }
            });

            c55.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c55.getLeft() - (width/2)+(c55.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.e1);
                }
            });

            c66.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c66.getLeft() - (width/2)+(c66.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.f1);
                }
            });

            c77.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c77.getLeft() - (width/2)+(c77.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.f2);
                }
            });

            c88.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c88.getLeft() - (width/2)+(c88.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.g1);
                }
            });

            c99.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c99.getLeft() - (width/2)+(c99.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.g2);
                }
            });

            c10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c10.getLeft() - (width/2)+(c10.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.a1);
                }
            });

            c101.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c101.getLeft() - (width/2)+(c101.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.a2);
                }
            });

            c102.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = (c102.getLeft() - (width/2)+(c102.getWidth()/2));
                    hsl.smoothScrollTo(s,0);
                    img.setImageResource(R.mipmap.b1);
                }
            });

        }*/

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.c1);
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.c2);
        MediaPlayer m3 = MediaPlayer.create(this, R.raw.d1);
        MediaPlayer m4 = MediaPlayer.create(this, R.raw.d2);
        MediaPlayer m5 = MediaPlayer.create(this, R.raw.e1);
        MediaPlayer m6 = MediaPlayer.create(this, R.raw.f1);
        MediaPlayer m7 = MediaPlayer.create(this, R.raw.f2);
        MediaPlayer m8 = MediaPlayer.create(this, R.raw.g1);
        MediaPlayer m9 = MediaPlayer.create(this, R.raw.g2);
        MediaPlayer m10 = MediaPlayer.create(this, R.raw.a1);
        MediaPlayer m11 = MediaPlayer.create(this, R.raw.a2);
        MediaPlayer m12 = MediaPlayer.create(this, R.raw.b1);

        MediaPlayer m13 = MediaPlayer.create(this, R.raw.c1m);
        MediaPlayer m14 = MediaPlayer.create(this, R.raw.c2m);
        MediaPlayer m15 = MediaPlayer.create(this, R.raw.d1m);
        MediaPlayer m16 = MediaPlayer.create(this, R.raw.d2m);
        MediaPlayer m17 = MediaPlayer.create(this, R.raw.e1m);
        MediaPlayer m18 = MediaPlayer.create(this, R.raw.f1m);
        MediaPlayer m19 = MediaPlayer.create(this, R.raw.f2m);
        MediaPlayer m20 = MediaPlayer.create(this, R.raw.g1m);
        MediaPlayer m21 = MediaPlayer.create(this, R.raw.g2m);
        MediaPlayer m22 = MediaPlayer.create(this, R.raw.a1m);
        MediaPlayer m23 = MediaPlayer.create(this, R.raw.a2m);
        MediaPlayer m24 = MediaPlayer.create(this, R.raw.b1m);

        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c11.getLeft() - (width/2)+(c11.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.c1);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaPlayer.start();
                    }
                });
            }
        });

        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c22.getLeft() - (width/2)+(c22.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.c2);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaPlayer1.start();
                    }
                });
            }
        });

        c33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c33.getLeft() - (width/2)+(c33.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.d1);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        m3.start();
                    }
                });
            }
        });

        c44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c44.getLeft() - (width/2)+(c44.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.d2);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        m4.start();
                    }
                });
            }
        });

        c55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c55.getLeft() - (width/2)+(c55.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.e1);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        m5.start();
                    }
                });
            }
        });

        c66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c66.getLeft() - (width/2)+(c66.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.f1);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        m6.start();
                    }
                });
            }
        });

        c77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c77.getLeft() - (width/2)+(c77.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.f2);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        m7.start();
                    }
                });
            }
        });

        c88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c88.getLeft() - (width/2)+(c88.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.g1);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        m8.start();
                    }
                });
            }
        });

        c99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c99.getLeft() - (width/2)+(c99.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.g2);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        m9.start();
                    }
                });
            }
        });

        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c10.getLeft() - (width/2)+(c10.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.a1);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        m10.start();
                    }
                });
            }
        });

        c101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c101.getLeft() - (width/2)+(c101.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.a2);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        m11.start();
                    }
                });
            }
        });

        c102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = (c102.getLeft() - (width/2)+(c102.getWidth()/2));
                hsl.smoothScrollTo(s,0);
                img.setImageResource(R.mipmap.b1);
                j1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        m12.start();
                    }
                });
            }
        });

        m111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setSelected(true);
                int s = (m111.getLeft() - (width/2)+(m111.getWidth()/2));
                hsl2.smoothScrollTo(s,0);
                int s2 = (c11.getLeft() - (width/2)+(c11.getWidth()/2));
                hsl.smoothScrollTo(s2,0);
                c11.setSelected(true);

                if(c11.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.c1);
                    Toast.makeText(getApplicationContext(), "Major chords selected", Toast.LENGTH_SHORT).show();
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mediaPlayer.start();
                        }
                    });
                }
                if(c22.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.c2);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mediaPlayer1.start();
                        }
                    });
                }
                if(c33.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.d1);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m3.start();
                        }
                    });
                }
                if(c44.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.d2);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m4.start();
                        }
                    });
                }
                if(c55.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.e1);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m5.start();
                        }
                    });
                }
                if(c66.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.f1);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m6.start();
                        }
                    });
                }
                if(c77.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.f2);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m7.start();
                        }
                    });
                }
                if(c88.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.g1);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m8.start();
                        }
                    });
                }
                if(c99.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.g2);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m9.start();
                        }
                    });
                }
                if(c10.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.a1);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m10.start();
                        }
                    });
                }
                if(c101.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.a2);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m11.start();
                        }
                    });
                }
                if(c102.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.b1);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m12.start();
                        }
                    });
                }
                if(c11.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.c1);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mediaPlayer.start();
                        }
                    });
                }
                c11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c11.getLeft() - (width/2)+(c11.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.c1);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mediaPlayer.start();
                            }
                        });
                    }
                });

                c22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c22.getLeft() - (width/2)+(c22.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.c2);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mediaPlayer1.start();
                            }
                        });
                    }
                });

                c33.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c33.getLeft() - (width/2)+(c33.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.d1);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                m3.start();
                            }
                        });
                    }
                });

                c44.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c44.getLeft() - (width/2)+(c44.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.d2);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                m4.start();
                            }
                        });
                    }
                });

                c55.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c55.getLeft() - (width/2)+(c55.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.e1);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                m5.start();
                            }
                        });
                    }
                });

                c66.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c66.getLeft() - (width/2)+(c66.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.f1);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                m6.start();
                            }
                        });
                    }
                });

                c77.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c77.getLeft() - (width/2)+(c77.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.f2);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                m7.start();
                            }
                        });
                    }
                });

                c88.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c88.getLeft() - (width/2)+(c88.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.g1);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                m8.start();
                            }
                        });
                    }
                });

                c99.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c99.getLeft() - (width/2)+(c99.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.g2);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                m9.start();
                            }
                        });
                    }
                });

                c10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c10.getLeft() - (width/2)+(c10.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.a1);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                m10.start();
                            }
                        });
                    }
                });

                c101.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c101.getLeft() - (width/2)+(c101.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.a2);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                m11.start();
                            }
                        });
                    }
                });

                c102.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c102.getLeft() - (width/2)+(c102.getWidth()/2));
                        hsl.smoothScrollTo(s,0);
                        img.setImageResource(R.mipmap.b1);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                m12.start();
                            }
                        });
                    }
                });

                c11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int s = (c11.getLeft() - (width / 2) + (c11.getWidth() / 2));
                        hsl.smoothScrollTo(s, 0);
                        img.setImageResource(R.mipmap.c1);
                        j1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mediaPlayer.start();
                            }
                        });
                    }
                });
            }
        });

        m222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setSelected(true);
                int s = (m222.getLeft() - (width/2)+(m222.getWidth()/2));
                hsl2.smoothScrollTo(s,0);
                int s3 = (c11.getLeft() - (width/2)+(c11.getWidth()/2));
                hsl.smoothScrollTo(s3,0);
                c11.setSelected(true);

                if(c11.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.c1m);
                    Toast.makeText(getApplicationContext(), "Minor Chords selected", Toast.LENGTH_SHORT).show();
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m13.start();
                        }
                    });
                }
                if(c22.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.c2m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m14.start();
                        }
                    });
                }
                if(c33.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.d1m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m15.start();
                        }
                    });
                }
                if(c44.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.d2m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m16.start();
                        }
                    });
                }
                if(c55.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.e1m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m17.start();
                        }
                    });
                }
                if(c66.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.f1m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m18.start();
                        }
                    });
                }
                if(c77.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.f2m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m19.start();
                        }
                    });
                }
                if(c88.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.g1m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m20.start();
                        }
                    });
                }
                if(c99.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.g2m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m21.start();
                        }
                    });
                }
                if(c10.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.a1m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m22.start();
                        }
                    });
                }
                if(c101.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.a2m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m23.start();
                        }
                    });
                }
                if(c102.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.b1m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m24.start();
                        }
                    });
                }
                if(c11.hasOnClickListeners())
                {
                    img.setImageResource(R.mipmap.c1m);
                    j1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            m13.start();
                        }
                    });
                }

                    c11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c11.getLeft() - (width / 2) + (c11.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.c1m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m13.start();
                                }
                            });
                        }
                    });

                    c22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c22.getLeft() - (width / 2) + (c22.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.c2m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m14.start();
                                }
                            });
                        }
                    });

                    c33.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c33.getLeft() - (width / 2) + (c33.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.d1m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m15.start();
                                }
                            });
                        }
                    });

                    c44.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c44.getLeft() - (width / 2) + (c44.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.d2m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m16.start();
                                }
                            });
                        }
                    });

                    c55.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c55.getLeft() - (width / 2) + (c55.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.e1m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m17.start();
                                }
                            });
                        }
                    });

                    c66.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c66.getLeft() - (width / 2) + (c66.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.f1m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m18.start();
                                }
                            });
                        }
                    });

                    c77.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c77.getLeft() - (width / 2) + (c77.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.f2m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m19.start();
                                }
                            });
                        }
                    });

                    c88.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c88.getLeft() - (width / 2) + (c88.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.g1m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m20.start();
                                }
                            });
                        }
                    });

                    c99.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c99.getLeft() - (width / 2) + (c99.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.g2m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m21.start();
                                }
                            });
                        }
                    });

                    c10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c10.getLeft() - (width / 2) + (c10.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.a1m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m22.start();
                                }
                            });
                        }
                    });

                    c101.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c101.getLeft() - (width / 2) + (c101.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.a2m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m23.start();
                                }
                            });
                        }
                    });

                    c102.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c102.getLeft() - (width / 2) + (c102.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.b1m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m24.start();
                                }
                            });
                        }
                    });

                    c11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int s = (c11.getLeft() - (width / 2) + (c11.getWidth() / 2));
                            hsl.smoothScrollTo(s, 0);
                            img.setImageResource(R.mipmap.c1m);
                            j1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    m13.start();
                                }
                            });
                        }
                    });
            }
        });
    }
}