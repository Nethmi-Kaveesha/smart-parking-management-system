package lk.ijse.parkingservice.controller;


import lk.ijse.parkingservice.entity.ParkingSpace;
import lk.ijse.parkingservice.service.ParkingSpaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parking")
public class ParkingSpaceController {

    private final ParkingSpaceService service;

    public ParkingSpaceController(ParkingSpaceService service) {
        this.service = service;
    }

    @PostMapping
    public ParkingSpace addSpace(@RequestBody ParkingSpace space) {
        return service.addSpace(space);
    }

    @GetMapping
    public List<ParkingSpace> getAll() {
        return service.getAllSpaces();
    }

    @GetMapping("/{id}")
    public ParkingSpace getById(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public ParkingSpace update(@PathVariable Long id, @RequestBody ParkingSpace space) {
        return service.updateSpace(id, space);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteSpace(id);
    }

    @GetMapping("/search")
    public List<ParkingSpace> searchByLocation(@RequestParam String location) {
        return service.searchByLocation(location);
    }

    @GetMapping("/available")
    public List<ParkingSpace> getAvailableSpaces() {
        return service.getAvailableSpaces();
    }
}
