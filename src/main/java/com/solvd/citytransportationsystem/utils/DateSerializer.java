package com.solvd.citytransportationsystemproject.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class DateSerializer extends StdSerializer<Date> {
  private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

  public DateSerializer() {
    this(null);
  }

  public DateSerializer(Class<Date> t) {
    super(t);
  }

  @Override
  public void serialize(Date value, JsonGenerator gen, SerializerProvider arg2) throws IOException {
    gen.writeString(formatter.format(value));
  }
}
