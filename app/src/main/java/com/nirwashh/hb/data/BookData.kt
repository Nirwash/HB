package com.nirwashh.hb.data

import com.nirwashh.hb.core.Abstract
import com.nirwashh.hb.domain.BookDomain

sealed class BookData : Abstract.Object<BookDomain, Abstract.Mapper.Empty>() {
}