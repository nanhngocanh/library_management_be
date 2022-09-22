package com.hedspi.library.response;

import com.hedspi.library.response.BorrowingBooksDetail.Detail;
import com.hedspi.library.response.BorrowingBooksDetail.General;

import java.util.List;
import java.util.Optional;

public class BorrowingDetail {
    private Optional<General> general;
    private List<Detail> details;

    public BorrowingDetail(Optional<General> general, List<Detail> details) {
        this.general = general;
        this.details = details;
    }

    public BorrowingDetail(){}

    public Optional<General> getGeneral() {
        return general;
    }

    public void setGeneral(Optional<General> general) {
        this.general = general;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }
}

