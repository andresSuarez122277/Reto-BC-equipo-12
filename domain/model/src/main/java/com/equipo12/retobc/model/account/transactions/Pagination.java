package com.equipo12.retobc.model.account.transactions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class Pagination {
   private short size;
   private short key;
}
