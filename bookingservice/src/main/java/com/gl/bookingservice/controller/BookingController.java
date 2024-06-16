package com.gl.bookingservice.controller;

import com.gl.bookingservice.DTO.BookingDTO;
import com.gl.bookingservice.DTO.NewBookingDTO;
import com.gl.bookingservice.DTO.RoomDTO;
import com.gl.bookingservice.DTO.UsersDTO;
import com.gl.bookingservice.config.OpenFeignRoomsClient;
import com.gl.bookingservice.config.OpenFeignUsersClient;
import com.gl.bookingservice.entity.Booking;
import com.gl.bookingservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookingController {

    @Autowired
    BookingService  bookingService;

    @Autowired
    OpenFeignUsersClient openFeignUsersClient;

    @Autowired
    OpenFeignRoomsClient openFeignRoomsClient;

    @PostMapping("/bookings")
    public String createBooking(@RequestBody NewBookingDTO newBookingDTO) {
        return bookingService.createBooking(newBookingDTO);
    }

    @GetMapping("/bookings")
    public List<Booking> getBookings(){
        return bookingService.getBookings();
    }

    @GetMapping("/bookings/{bid}")
    public Optional<BookingDTO> getBookingById(@PathVariable int bid)
    {
        Optional<Booking> booking = bookingService.getBooking(bid);

        UsersDTO usersDTO=openFeignUsersClient.getUser(booking.get().getUid());
        RoomDTO roomDTO=openFeignRoomsClient.getRoom(booking.get().getRid());

        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setBid(booking.get().getBid());
        bookingDTO.setUsers(usersDTO);
        bookingDTO.setRoom(roomDTO);

        return Optional.of(bookingDTO);
    }

    @DeleteMapping("/bookings/{bid}")
    public String deleteBooking(@PathVariable int bid)
        {
            return bookingService.deleteBooking(bid);
        }

}
