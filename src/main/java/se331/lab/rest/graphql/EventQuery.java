package se331.lab.rest.graphql;

import com.google.auto.value.AutoValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventQuery {
    String title;
    String category;
}
