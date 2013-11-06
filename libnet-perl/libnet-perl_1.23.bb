SUMMARY = "libnet is a collection of perl5 modules which all related to network programming. The majority of the modules available provided the client side of popular server-client protocols that are used in the internet community."
AUTHOR = "Steve Hay <shay@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/libnet"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=15fe5493d0e7adaf2e10139f752211e2"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SH/SHAY/libnet-${PV}.tar.gz"
SRC_URI[md5sum] = "1e997bbc53c073e7b4fd23b5bf92c87e"
SRC_URI[sha256sum] = "67edd05f0a2b93ca8fe9ba98d45667df74b78b1eaeb502404ae511e7a5f6513c"

S = "${WORKDIR}/libnet-${PV}"

inherit cpan

RDEPENDS_${PN} += "libio-socket-perl \
                   libsocket-perl \
                   "

RPROVIDES_${PN} += "libnet-cmd-perl \
                    libnet-config-perl \
                    libnet-domain-perl \
                    libnet-ftp-perl \
                    libnet-nntp-perl \
                    libnet-netrc-perl \
                    libnet-pop3-perl \
                    libnet-smtp-perl \
                    libnet-time-perl \
                    libnet-ftp-a-perl \
                    libnet-perl-dataconn-perl \
                    libnet-ftp-e-perl \
                    libnet-ftp-i-perl \
                    libnet-ftp-l-perl \
                    "

BBCLASSEXTEND = "native"
