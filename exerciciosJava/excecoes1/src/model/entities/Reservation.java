package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	//construtores
	public Reservation() {
	}
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainExceptions{
		if(!checkOut.after(checkIn)) {
			throw new DomainExceptions("Error in reservation: Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	//getters e setters
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainExceptions {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {//se a data de checkin for ante de now(data atual) ou checkout for antes de now.
			throw new DomainExceptions("Error in reservation: Reservation date for updates must be future dates."); //exceçao puxada da classe DomainExceptions
		}
		if(!checkOut.after(checkIn)) {
			throw new DomainExceptions("Error in reservation: Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ " , check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
		
	}
	
	
}
