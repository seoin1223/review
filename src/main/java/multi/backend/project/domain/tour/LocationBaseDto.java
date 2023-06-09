package multi.backend.project.domain.tour;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LocationBaseDto {

    private double posX;
    private double posY;
    private int radius;
}
